# Webservice Project
<div align="center">
    <img src="https://cdn.worldvectorlogo.com/logos/java-4.svg" alt="Java Logo" width="200" height="200"/>
    <img src="https://cdn.worldvectorlogo.com/logos/spring-3.svg" alt="Spring Boot Logo" width="200" height="200"/>
</div>

## 📝 Sobre o Projeto

O Webservice Project é uma aplicação backend desenvolvida em Java com o framework Spring Boot. Este projeto tem como objetivo fornecer serviços RESTful para gestão de usuários, pedidos, produtos, categorias e pagamentos, com uma arquitetura organizada em camadas para garantir escalabilidade e manutenção.

## 🗂️ Estrutura do Projeto

```
webservice/
├── src/
│   ├── main/
│   │   ├── java/com/projectwebservice/webservice/
│   │   │   ├── config/                # Configurações específicas do projeto
│   │   │   ├── entities/             # Entidades JPA (User, Product, Order, etc.)
│   │   │   ├── repositories/         # Interfaces para acesso ao banco de dados
│   │   │   ├── resources/            # Controladores REST
│   │   │   ├── services/             # Lógica de negócio
│   │   │   └── services/exceptions/  # Exceções personalizadas para a aplicação
│   │   └── resources/                # Configurações e arquivos estáticos
│   └── test/java/com/projectwebservice/webservice/
│       └── WebserviceApplicationTests.java # Testes automatizados
├── pom.xml                           # Configuração do Maven
├── README.md                         # Documentação do projeto
├── HELP.md                           # Documentação auxiliar do Spring Boot
├── mvnw / mvnw.cmd                   # Wrapper do Maven
└── .idea/                            # Arquivos de configuração do IntelliJ IDEA
```

## 🛠️ Tecnologias Utilizadas

- **Java 17**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento backend.
- **JPA/Hibernate**: Mapeamento objeto-relacional (ORM).
- **H2 Database**: Banco de dados em memória para ambiente de testes.
- **Maven**: Gerenciador de dependências e build.

## 🚀 Como Executar o Projeto

### Requisitos

- Java 17 ou superior
- Maven

### Passos para Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/webservice.git
   cd webservice
   ```

2. Compile o projeto:
   ```bash
   mvn clean install
   ```

3. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

## 🌐 Rotas Disponíveis

### Usuários (Users)
- `GET /users` - Lista todos os usuários.
- `GET /users/{id}` - Consulta um usuário por ID.
- `POST /users` - Cria um novo usuário.
- `PUT /users/{id}` - Atualiza os dados de um usuário.
- `DELETE /users/{id}` - Deleta um usuário.

### Produtos (Products)
- `GET /products` - Lista todos os produtos.
- `GET /products/{id}` - Consulta um produto por ID.
- `POST /products` - Cria um novo produto.
- `PUT /products/{id}` - Atualiza os dados de um produto.
- `DELETE /products/{id}` - Deleta um produto.

### Pedidos (Orders)
- `GET /orders` - Lista todos os pedidos.
- `GET /orders/{id}` - Consulta um pedido por ID.

### Categorias (Categories)
- `GET /categories` - Lista todas as categorias.
- `GET /categories/{id}` - Consulta uma categoria por ID.

## 🤝 Contribuição

1. Faça um fork do projeto
2. Crie sua branch de feature (`git checkout -b feature/MinhaFeature`)
3. Commit suas mudanças (`git commit -m 'Adiciona MinhaFeature'`)
4. Faça um push para a branch (`git push origin feature/MinhaFeature`)
5. Abra um Pull Request

## 👤 Autor

**Ramon Trindade**
- LinkedIn: [linkedin.com/in/ramontrndd](https://linkedin.com/in/ramontrndd)
- GitHub: [github.com/ramontrndd](https://github.com/ramontrndd)
## 📄 Licença
Este projeto está sob licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.
