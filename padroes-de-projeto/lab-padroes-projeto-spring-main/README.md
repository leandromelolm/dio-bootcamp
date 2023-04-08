# Explorando Padrões de Projetos na Prática com Java

Repositório com implementações explorados na Lab 
"Explorando Padrões de Projetos na Prática com Java" com professor Venilton FalvoJr. 
Esse é um de alguns projetos entregues no Bootcamp Banco Pan Java Developer. 
Este projeto explorou alguns padrões usando o Spring Framework, são eles:
- Singleton
- Strategy/Repository
- Facade

Foram feitas modificações no projeto para usar o Java versão 17 e o Spring Boot versão 3.0.0.

## Dependências usadas
- Spring Data JPA
- Spring Web
- H2 Database
- OpenFeign
- Hibernate
- OpenAPI (Swagger)

## Explorar o projeto e testar requisições

Ao executar o projeto é possível ver as rotas disponíveis no seguinte endereço: 
> http://127.0.0.1:8080/swagger-ui.html


Formato Json para criar uma cliente:
```json
{
  "nome": "QualquerNomeString",
  "endereco": {
    "cep": "50030320"
  }
}
```

Retorno:
```json
{
  "id": 1,
  "nome": "QualquerNomeString",
  "endereco": {
    "cep": "50030-320",
    "logradouro": "Praça Rio Branco",
    "complemento": "",
    "bairro": "Recife",
    "localidade": "Recife",
    "uf": "PE",
    "ibge": "2611606",
    "gia": "",
    "ddd": "81",
    "siafi": "2531"
  }
}
```