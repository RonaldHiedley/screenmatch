# 🎬 ScreenMatch

![Java](https://img.shields.io/badge/Java-17+-orange)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)
![License](https://img.shields.io/badge/license-MIT-blue)

Aplicação Java que consome a API do OMDb para buscar informações de filmes, converter dados JSON em objetos Java e armazenar os resultados em arquivo `.json`.

---

## 📌 Sobre o projeto

O **ScreenMatch** é uma aplicação de linha de comando desenvolvida com foco em prática de:

* Consumo de APIs REST
* Manipulação de JSON
* Tratamento de exceções
* Boas práticas de organização de código

---

## 🚀 Funcionalidades

* 🔎 Busca interativa de filmes
* 🌐 Integração com API OMDb
* 🔄 Conversão JSON → Objeto Java (Gson)
* 📁 Exportação para arquivo JSON
* ⚠️ Tratamento de erros com exceção customizada

---

## 🛠️ Tecnologias

* **Java 17+**
* **HttpClient (Java nativo)**
* **Gson**
* **OMDb API**

---

## 📂 Estrutura do projeto

```
screenmatch/
├── src/
│   ├── Principal/
│   │   └── MainWithSearch.java
│   ├── modelos/
│   │   ├── Titulo.java
│   │   └── TituloOmdb.java
│   └── excecao/
│       └── ErroDeConversãoDeAnoException.java
├── filmes.json
└── README.md
```

---

## ▶️ Como executar

```bash
# Clone o projeto
git clone https://github.com/seu-usuario/screenmatch.git

# Abra no IntelliJ

# Execute a classe principal
MainWithSearch.java
```

---

## 💻 Exemplo de uso

```
Filme desejado:
matrix

Titulo já convertido
Titulo{nome='Matrix', ano=1993, duracaoEmMinutos=60}
```

Digite `Sair` para encerrar.

---

## 📁 Saída gerada

O sistema cria automaticamente:

```
filmes.json
```

Exemplo:

```json
[
  {
    "nome": "Matrix",
    "ano": 1993,
    "duracaoEmMinutos": 60
  }
]
```

---

## ⚠️ Tratamento de erros

A aplicação trata:

* NumberFormatException
* IllegalArgumentException
* ErroDeConversãoDeAnoException

---

## 🧠 Conceitos aplicados

* Programação orientada a objetos (POO)
* Separação de responsabilidades
* Consumo de API REST
* Manipulação de arquivos
* Uso de `record` (Java moderno)

---

## 🚧 Melhorias futuras

* [ ] Integração com banco de dados (PostgreSQL)
* [ ] Criar API REST com Spring Boot
* [ ] Interface gráfica (JavaFX ou Web)
* [ ] Filtros e ordenação de filmes
* [ ] Histórico de buscas

---

## 👨‍💻 Autor

**Ronald Hiedley Salvador**

---

## 📄 Licença

Este projeto está sob a licença MIT.
