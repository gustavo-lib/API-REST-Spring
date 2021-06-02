# API-REST-Spring

## Requisitos
- Java 8 
- Maven 3.0
- Eclipse 
- Spring Boot
- Postman

## Dependencias del proyecto SpringBoot
- Spring Web
- Spring Data JPA
- Data Base H2

## API Description 
### Endpoint Controller client

METHOD | PATH | DESCRIPTION 
------------|-----|------------
GET |http://localhost:8080/api/client | get all costumer
GET |http://localhost:8080/api/client/{code} | get one costumer
PUT |http://localhost:8080/api/client/{code} | update costumer
POST |http://localhost:8080/api/client | save costumer
DELETE |http://localhost:8080/api/client/{code} | delete costumer

### Endpoint Controller invoice

METHOD | PATH | DESCRIPTION 
------------|-----|------------
GET |http://localhost:8080/api/invoice | get all invoice
GET |http://localhost:8080/api/invoice/{code} | get one invoice
POST |http://localhost:8080/api/invoice/save/{code} | save invoice
POST |http://localhost:8080/api/invoice/{code1}/items/{code2}/add/{code3} | save item-quantity

