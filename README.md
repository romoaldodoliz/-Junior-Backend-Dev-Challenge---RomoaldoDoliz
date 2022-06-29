# -Junior-Backend-Dev-Challenge---RomoaldoDoliz
Challenge


Para executar o projeto no terminal, digite o seguinte comando:

```
mvn spring-boot:run 

```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8081/api/v1/people

```
Pré-requisitos para a execução do projeto desenvolvido:

* Java 11 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Uma IDE exemplo Intellj IDEA Community Edition, Eclipse ou qualquer outra de sua escolha.

## Banco de dados:
Nesteprojecto o pom.xml adicionei o H2 para testes locais.
Porém nada impede que você adicione qualquer outro banco de dados de sua preferência. ☺️


### Para Acessar o banco h2 console após execultar o projeto.
* http://localhost:8081/h2-console  
* Nome do banco de dados: testdb
* Adicionar na URL o nome do banco desta forma : jdbc:h2:mem:testdb

### Postman 🚀🚀

### Registrando uma pessoa na base de dados utilizando o Postamn 

* POST - Create 
http://localhost:8081/api/v1/people

```
{
      
        "firstName": "Romoaldo",
        "lastName": "Doliz",
        "BI": "00626163766327F",
        "NUIT": "00626163766327F",
        "Estadocivil": "Solteiro",
        "Endereco": "Matola",
        "birthDate": "01-01-2001",
        "phones":[
            {
                "type": "MOBILE",
                "number": "(81)888888888"
            }
        ]

}

```


### Outras operações podem ser realizadas conforme no Postman
* GET
* PUT
* DELETE

## License
MIT © [RomoaldoDoliz](https://github.com/romoaldodoliz)<br />

## 👨👩 Social [🔝](#welcome-badges-4-readmemd-profile)
Obrigado
