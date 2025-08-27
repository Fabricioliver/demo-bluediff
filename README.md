# 🧪 Demo BlueDiff + SDLC

Este repositório contém uma aplicação Java com Spring Boot desenvolvida como protótipo para demonstração prática do uso da ferramenta [Diffblue Cover](https://www.diffblue.com/) no ciclo de vida do desenvolvimento de software (SDLC), com foco na **geração automática de testes unitários**.

---

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3**
- **Gradle 8+**
- **PostgreSQL**
- **Swagger/OpenAPI**
- **Diffblue Cover** (versão trial)
- **IntelliJ IDEA**
- **Docker / Docker Compose**

---

## 📌 Funcionalidades

- CRUD completo para:
  - Clientes
  - Produtos
  - Pedidos com Itens de Pedido
- API REST com Swagger
- Testes unitários automatizados com Diffblue Cover
- Mocks automáticos de dependências
- Integração transparente com IntelliJ

---

## 📌 Observações

A integração com o Diffblue foi realizada via plugin no IntelliJ

O projeto está pronto para demonstração técnica e pode ser expandido em sua versão Enterprise

Esta versão usa o Diffblue Cover Trial (algumas limitações)

---

## 📂 Estrutura do Projeto

demo-bluediff/
├── src/
│ ├── main/
│ │ ├── java/
│ │ └── resources/
│ └── test/
│ └── java/
├── docker-compose.yml
├── Dockerfile
├── build.gradle
├── settings.gradle
└── README.md

---

## 🧠 Sobre o Diffblue

O Diffblue Cover é uma ferramenta de geração automática de testes unitários baseada em IA, que analisa o código existente e cria testes sem intervenção manual.
Entre os principais diferenciais:

🕒 Mocks Automáticos de dependências

📉 Validação de Fluxo (ex: persistência)

📊 Cenários Abrangentes (casos válidos + bordas)

🧪 Cobertura Real sem escrita manual

## 🐳 Execução via Docker

### 1. Pré-requisitos

- Docker
- Docker Compose

### 2. Subir a aplicação

```bash
# Build do projeto (caso necessário)
./gradlew clean build

---

# Subir os containers
docker-compose up --build

#A aplicação ficará disponível em
http://localhost:8080/swagger-ui/index.html
