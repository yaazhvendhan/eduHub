# EduHub Backend

<p align="left">
  <img src="https://img.shields.io/badge/Java-21-007396?logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring%20Boot-4.0.6-6DB33F?logo=springboot&logoColor=white" />
  <img src="https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven&logoColor=white" />
  <img src="https://img.shields.io/badge/Packaging-JAR-555555" />
</p>

---

## Overview

EduHub Backend is a Spring Boot-based RESTful service designed as the foundation for an educational platform.

The project currently focuses on establishing a clean architecture, implementing core REST endpoints, and structuring services for future scalability.

---

## Project Setup

| Property     | Value                      |
|--------------|----------------------------|
| Group ID     | com.eduHub                 |
| Artifact ID  | eduHub-backend             |
| Package Name | com.eduHub.eduHub_backend  |
| Java Version | 21                         |
| Packaging    | JAR                        |
| Build Tool   | Maven                      |

---

## Dependencies

- Spring Web (Spring MVC, embedded Tomcat)
- Spring Boot DevTools

---

## Project Structure

```
.
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   ├── java/com/eduHub/eduHub_backend
│   │   │   ├── EduHubBackendApplication.java
│   │   │   ├── component
│   │   │   │   ├── CourseService.java
│   │   │   │   ├── MaterialService.java
│   │   │   │   └── StudentService.java
│   │   │   └── controller
│   │   │       ├── CourseController.java
│   │   │       ├── HelloWorldController.java
│   │   │       ├── MaterialController.java
│   │   │       └── StudentController.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test
│       └── java/com/eduHub/eduHub_backend
│           └── EduHubBackendApplicationTests.java
└── target
    ├── classes/
    ├── generated-sources/
    ├── generated-test-sources/
    ├── maven-status/
    └── test-classes/
```

---

## Architecture Overview

The project follows a layered architecture:

### Controller Layer
Handles incoming HTTP requests and maps them to appropriate service methods.

### Service Layer (Component)
Contains business logic and data handling.

### Configuration Layer
Managed using `application.properties`.

### Future Enhancements
- Repository Layer (database interaction)
- DTOs & Validation
- Exception Handling Layer

---

## Build and Run

### Build

```bash
mvn clean install
```

### Run

```bash
mvn spring-boot:run
```

Or run the packaged JAR:

```bash
java -jar target/eduHub-backend.jar
```

---

## Configuration

Default configuration file:

```
src/main/resources/application.properties
```

### Current Configurations

- Server port configured
- Application name injected using `@Value`
- Environment variables accessed using `Environment`

---

## API Endpoints

### Hello World

```http
GET /hello-world
```

**Response**
```text
Hello World
```

---

### Environment Details

```http
GET /env
```

**Response**
```text
App Name : <application_name>, Port : <port>
```

---

### Get Single Student

```http
GET /student
```

**Response**
```json
{
  "id": 1,
  "firstName": "Yaazh",
  "lastName": "M"
}
```

---

### Get All Students

```http
GET /students
```

**Response**
```json
[
  { "id": 1, "firstName": "Yaazh", "lastName": "M" },
  { "id": 2, "firstName": "Saturn", "lastName": "Ring" },
  { "id": 3, "firstName": "String", "lastName": "Ray" },
  { "id": 4, "firstName": "John", "lastName": "Snow" }
]
```

---

### Get Student Using Path Variables

```http
GET /{id}/{firstName}/{lastName}
```

**Example**

```http
GET /1/Yaazh/M
```

**Response**
```json
{
  "id": 1,
  "firstName": "Yaazh",
  "lastName": "M"
}
```

---

### Get Materials

```http
GET /materials
```

**Response**
```text
No Material Available
```
---
### Get Student Using Query Parameters

```http
GET /query?id={id}&firstName={firstName}&lastName={lastName}
```

**Example**

```http
GET /query?id=1&firstName=Yaazh&lastName=M
```

**Response**
```json
{
  "id": 1,
  "firstName": "Yaazh",
  "lastName": "M"
}
```

---

## Current Status

### Core Setup
- Spring Boot project initialized
- Maven build configured
- Application running successfully

### Implemented Features
- Hello World endpoint
- Environment variables endpoint
- Student APIs (single, list, path variables)
- Material API

### Services
- CourseService (basic response)
- MaterialService
- StudentService (data model + logic)

### Controllers
- HelloWorldController
- StudentController
- MaterialController
- CourseController (basic setup)

### Code Quality
- Removed unused code
- Fixed naming issues
- Structured package organization

---

## Roadmap

Planned improvements:

- Introduce database integration (Spring Data JPA)
- Add validation and exception handling
- Implement authentication & authorization (Spring Security)
- Add logging and monitoring
- Containerization using Docker
- CI/CD pipeline integration

---

## License

To be defined.