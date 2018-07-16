# How To Configure Spring Boot Jersey and Swagger
[![Build Status](https://travis-ci.org/Sanjay007/Springboot-Jersey-Swagger.svg?branch=master)](https://travis-ci.org/Sanjay007/Springboot-Jersey-Swagger)
# Problem Statement
 - How To Integrate Spring Boot, Jersey, Swagger to build real world JSON-based RESTful web services

# Before You Start It Up
We must Have Spring Boot Starter Web as a dependency for Swagger UI to Work Properly .

# Run the Web Services
----------------------------------------------------------------------------------------------------------------------
> curl -X POST "http://localhost:8080/api/users" -H "accept: application/json" -H "Content-Type: application/json" -d 
"{ \"id\": \"78\", \"name\": \"huu\"}"

>curl -X GET "http://localhost:8080/api/users" -H "accept: application/json"
"[{"id": "1","name": "password"},{"id": "2","name": "huu"}]
-------------------------------------------------------------------------------------------------------------------------
# Blog Link
<h1>http://frugalisminds.com/spring-boot/configure-swagger-with-jersey-and-spring-boot//</h1>

http://frugalisminds.com/wp-content/uploads/2018/07/swagger-768x304.png
