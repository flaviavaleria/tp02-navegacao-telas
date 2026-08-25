# TP02 - Navegação de Telas

Aplicativo Android desenvolvido como trabalho prático, com o objetivo de praticar navegação entre telas (Activities) e troca de dados via `Intent`.

## Sobre o app

O app simula um cadastro simples de uma **Biblioteca de Livros**:

1. **Tela principal** — o usuário informa o título e o autor de um livro.
2. **Tela de detalhes** — exibe os dados cadastrados, com opção de voltar para a tela anterior.

## Funcionalidades

- Cadastro de livro com campos de título e autor
- Validação dos campos obrigatórios, com mensagem de erro visual nos próprios campos (`TextInputLayout`) e um `Toast`
- Navegação entre telas com `Intent` e envio de dados via `putExtra`
- Botão "Voltar" na tela de detalhes
- Tema visual customizado (rosa), com suporte a modo claro e escuro

## Tecnologias

- [Kotlin](https://kotlinlang.org/)
- Android SDK (`minSdk` 24, `targetSdk`/`compileSdk` 36)
- [Material Components for Android](https://github.com/material-components/material-components-android)
- ConstraintLayout

## Estrutura do projeto

```
app/src/main/java/com/example/tp02_navegaodetelas/
├── MainActivity.kt       # Tela de cadastro
└── DetailsActivity.kt    # Tela de detalhes do livro

app/src/main/res/
├── layout/                # Layouts das telas (activity_main.xml, activity_details.xml)
├── values/                # Strings, cores e tema
└── values-night/           # Tema para modo escuro
```

## Como rodar

1. Clone o repositório:
   ```bash
   git clone https://github.com/flaviavaleria/tp02-navegacao-telas.git
   ```
2. Abra a pasta do projeto no **Android Studio**.
3. Aguarde a sincronização do Gradle.
4. Rode o app em um emulador ou dispositivo físico (API 24+).

## Autores

- Flávia Valéria
- Victória Antunes
