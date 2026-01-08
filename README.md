# Spring boot crud

A simple Spring Boot CRUD application for managing users with DTOs, Lombok, MapStruct, MySQL

## Concept

Spring boot :- 
    Rest Api,
    Jpa,
    Global exception handling,
    Lombok,
    Mapstruct,
    Validation

database :-
   mysql


## Curl's

curl -X POST "http://localhost:8080/user" -H "Content-Type: application/json" -d "{\"username\":\"Ram\",\"fatherName\":\"Ghanshyam",\"motherName\":\"Jane\",\"password\":\"secret123\"}"

curl -X GET http://localhost:8080/user/{id}

curl -X PUT "http://localhost:8080/user/{id}" -H "Content-Type: application/json" -d "{\"username\":\"Ram\",\"fatherName\":\"Ghanshyam\",\"motherName\":\"Urmila\",\"password\":\"newsecret123\"}"

curl -X DELETE http://localhost:8080/user/{id}