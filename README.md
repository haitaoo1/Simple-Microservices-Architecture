# Microservices Architecture with Spring Boot

This project demonstrates a simple microservices architecture using **Spring Boot**, **Spring Cloud Gateway**, **Eureka Service Discovery**, and **Spring Cloud Config Server**. The architecture supports dynamic configuration management, service discovery, and API routing, along with communication between independent services.

## Architecture Overview

This architecture consists of the following components:

1. **API Gateway**:
   - Acts as the single entry point for all client requests.
   - Routes requests to the respective microservices (`Students` and `Courses`) based on predefined URI patterns.
   - Provides centralized handling for cross-cutting concerns such as routing, security, and rate limiting.

2. **Students Microservice**:
   - Manages student-related data.
   - Stores data in a **MySQL** database.
   - Exposes REST endpoints for CRUD operations.

3. **Courses Microservice**:
   - Manages course-related data.
   - Stores data in a **PostgreSQL** database.
   - Exposes REST endpoints for CRUD operations.

4. **Eureka Server**:
   - Handles service discovery.
   - Registers all microservices, enabling dynamic communication without hardcoding service URLs.
   - Ensures fault tolerance by allowing services to discover healthy instances dynamically.

5. **Config Server**:
   - Centralizes configuration management for all services.
   - Supplies configurations to microservices at runtime.
   - Simplifies configuration updates without the need to redeploy services.
     

## Project Features

- **Spring Cloud Gateway** for routing and API management.
- **Spring Cloud Config Server** for centralized configuration management.
- **Eureka Server** for service registration and discovery.
- Two microservices (`Students` and `Courses`) with separate databases for data management.

## Diagram

![Microservices Architecture]([https://github.com/haitaoo1/Simple-Microservices-Architecture/blob/3886c6e70ed60614803878a9da8b144b3043578c/source/MicroArchitecture.png](https://github.com/haitaoo1/Simple-Microservices-Architecture/blob/main/source/MicroArchitecture.png))
