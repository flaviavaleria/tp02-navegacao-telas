package com.example.tp02_navegaodetelas

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.doOnTextChanged
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tilTitle = findViewById<TextInputLayout>(R.id.tilTitle)
        val tilAuthor = findViewById<TextInputLayout>(R.id.tilAuthor)
        val etTitle = findViewById<TextInputEditText>(R.id.etTitle)
        val etAuthor = findViewById<TextInputEditText>(R.id.etAuthor)
        val btnRegister = findViewById<MaterialButton>(R.id.btnRegister)

        etTitle.doOnTextChanged { _, _, _, _ -> tilTitle.error = null }
        etAuthor.doOnTextChanged { _, _, _, _ -> tilAuthor.error = null }

        btnRegister.setOnClickListener {
            val title = etTitle.text?.toString()?.trim().orEmpty()
            val author = etAuthor.text?.toString()?.trim().orEmpty()

            tilTitle.error = if (title.isEmpty()) getString(R.string.error_empty_fields) else null
            tilAuthor.error = if (author.isEmpty()) getString(R.string.error_empty_fields) else null

            if (title.isEmpty() || author.isEmpty()) {
                Toast.makeText(this, R.string.error_empty_fields, Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, DetailsActivity::class.java).apply {
                putExtra(DetailsActivity.EXTRA_TITLE, title)
                putExtra(DetailsActivity.EXTRA_AUTHOR, author)
            }
            startActivity(intent)
        }
    }
}