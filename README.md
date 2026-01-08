## spring boot crud

A simple Spring Boot CRUD application for managing users with DTOs, Lombok, MapStruct, MySQL

# Concept

Spring boot :- 
    Rest Api
    jpa
    Global exception handling
    Lombok
    mapstruct
    validation

database :-
   mysql


# curl

curl -X POST "http://localhost:8080/user" -H "Content-Type: application/json" -d "{\"username\":\"Ram\",\"fatherName\":\"\Ghanshyam",\"motherName\":\"Jane\",\"password\":\"secret123\"}"

curl -X GET http://localhost:8080/user/d290f1ee-6c54-4b01-90e6-d701748f0851

curl -X PUT "http://localhost:8080/user/d290f1ee-6c54-4b01-90e6-d701748f0851" -H "Content-Type: application/json" -d "{\"username\":\"Ram\",\"fatherName\":\"Ghanshyam\",\"motherName\":\"Urmila\",\"password\":\"newsecret123\"}"

curl -X DELETE http://localhost:8080/user/d290f1ee-6c54-4b01-90e6-d701748f0851