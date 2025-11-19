# 📦 Projeto Estoque - API de Gerenciamento de Produtos

## 🎯 Visão Geral

Este projeto é uma **API RESTful** simples para gerenciamento de estoque de produtos, desenvolvida utilizando o framework **Spring Boot**. A aplicação segue o padrão MVC (Model-View-Controller) e utiliza o **Spring Data JPA** para persistência de dados em um banco de dados em memória **H2**.

O objetivo principal é fornecer endpoints para listar e buscar produtos por ID.

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão | Descrição |
| :--- | :--- | :--- |
| **Java** | 21 | Linguagem de programação principal. |
| **Spring Boot** | 3.5.7 | Framework para desenvolvimento rápido de aplicações Java. |
| **Maven** | - | Ferramenta de gerenciamento de dependências e construção de projetos. |
| **Spring Data JPA** | - | Abstração para acesso a dados com Hibernate. |
| **H2 Database** | - | Banco de dados em memória, ideal para desenvolvimento e testes. |
| **Lombok** | - | Biblioteca para reduzir código boilerplate (getters, setters, etc.). |

## ⚙️ Estrutura do Projeto

O projeto segue a estrutura padrão de uma aplicação Spring Boot com Maven:

```
estoque/
├── src/main/java/com/anm/estoque/
│   ├── EstoqueApplication.java  # Classe principal da aplicação
│   ├── controller/
│   │   └── EstoqueController.java # Endpoints da API
│   ├── model/
│   │   └── ProdutoModelo.java     # Entidade de Produto (Model)
│   ├── repository/
│   │   └── ProdutoRepositorio.java # Interface de acesso a dados (JPA)
│   └── service/
│       └── EstoqueServico.java    # Lógica de negócio (Service)
├── src/main/resources/
│   └── application.properties     # Configurações da aplicação (Porta, H2, JPA)
└── pom.xml                        # Configurações e dependências do Maven
```

## 🚀 Como Executar o Projeto

### Pré-requisitos

Certifique-se de ter o **Java Development Kit (JDK) 21** ou superior instalado em sua máquina.

### Passos

1.  **Clone o repositório** (ou descompacte o arquivo `estoque.zip`).
2.  **Navegue até o diretório** raiz do projeto (`estoque`).
3.  **Execute a aplicação** usando o Maven Wrapper:

    ```bash
    ./mvnw spring-boot:run
    ```

    *A aplicação será iniciada na porta `8080`.*

## 🌐 Endpoints da API

A API expõe os seguintes endpoints:

| Método | URL | Descrição |
| :--- | :--- | :--- |
| `GET` | `/` | Endpoint de teste. Imprime uma mensagem no console do servidor. |
| `GET` | `/listar` | Lista todos os produtos cadastrados no estoque. |
| `GET` | `/{id}` | Busca um produto específico pelo seu `ID`. |

### Exemplo de Uso

Assumindo que a aplicação está rodando localmente:

*   **Listar Produtos:**
    ```
    GET http://localhost:8080/listar
    ```

*   **Buscar Produto por ID (Exemplo ID 1):**
    ```
    GET http://localhost:8080/1
    ```

## 💾 Banco de Dados H2

O projeto utiliza o banco de dados em memória H2, configurado para ser acessível via console web.

*   **URL do Console H2:** `http://localhost:8080/h2-console`
*   **JDBC URL:** `jdbc:h2:mem:produtosdb`
*   **Usuário:** `sa`
*   **Senha:** (Vazio)

Você pode acessar o console para visualizar a tabela `TB-PRODUTOS` e os dados que o Hibernate cria automaticamente.

## 🔑 Entidade Principal: `ProdutoModelo`

A entidade `ProdutoModelo` representa um item no estoque e está mapeada para a tabela `tb-produtos`.

| Campo | Tipo | Descrição |
| :--- | :--- | :--- |
| `id` | `Long` | Identificador único do produto (Chave Primária). |
| `nome` | `String` | Nome do produto. |
| `preco` | `Double` | Preço unitário do produto. |
| `modelo` | `String` | Modelo ou versão do produto. |
| `descricao` | `String` | Descrição detalhada do produto. |

---

*Documentação gerada por **Manus AI**.*
