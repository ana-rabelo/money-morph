<h5 align="center">
<img width='500px' src="https://i.imgur.com/eeqpMpL.png">

![GitHub Created At](https://img.shields.io/github/created-at/ana-rabelo/money-morph)
![GitHub License](https://img.shields.io/github/license/ana-rabelo/money-morph)
![Static Badge](https://img.shields.io/badge/status-finalizado-black)

<i>Um conversor de moedas desenvolvido em Java que consome a [ExchangeRate-API](https://www.exchangerate-api.com/) para converter os valores e moedas inseridas pelo usuário por meio da interação com o console.</i>
</h5>

------

# 🪙 Sobre o projeto

Este projeto foi desenvolvido como um desafio para aplicar os conhecimentos adquiridos na Formação de Java e Orientação a Objetos. O conversor de moedas, batizado de **MoneyMorph**, realiza a conversão de diversas moedas por meio da interação com o usuário no console e consome dados da [ExchangeRate-API](https://www.exchangerate-api.com/). 

> [!TIP] 
> Caso deseje testar outras moedas, você pode adicionar novas entradas ao currencyMap em Main.java.


# 💻 Tecnologias e ferramentas utilizadas

As tecnologias e ferramentas usadas neste projeto são:

- **Java 21** - Linguagem de programação para desenvolver o sistema.
- **Maven** - Gerenciador de dependências e build automation.
- **ExchangeRate-API** - API externa para obter taxas de câmbio.
- **Jackson Databind** - Biblioteca para manipulação de dados JSON.
- **Dotenv** - Biblioteca para carregar variáveis de ambiente.
- **IntelliJ IDEA** - IDE utilizada para desenvolver e testar o projeto.

# 📁 Acesso ao projeto

Você pode acessar o [código fonte do projeto inicial](https://github.com/ana-rabelo/money-morph) ou [baixá-lo](https://github.com/ana-rabelo/money-morph/archive/refs/heads/main.zip).

# 🛠️ Abrir e rodar o projeto

Após baixar ou clonar o projeto, abra o diretório do projeto no terminal e execute o comando abaixo para compilar o projeto:

```bash
mvn clean install
```

Execute a aplicação com o comando:

```bash
mvn exec:java
```

> [!CAUTION] 
> Certifique-se de que o Java e o Maven estejam corretamente configurados no PATH do seu sistema.

E siga as instruções exibidas no console para realizar a conversão de moedas.

> [!IMPORTANT]  
> Lembre-se de criar um arquivo .env para configurar a variável de ambiente API_KEY e configurar sua chave da API da ExchangeRate-API.


# 👩‍💻 Autores
| [<img width='70px' loading="lazy" src="https://avatars.githubusercontent.com/u/50804149?v=4" width=115><br><sub>Ana Paula Rabelo</sub>](https://github.com/ana-rabelo) |
| :---: |
