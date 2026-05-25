# EduHub Backend

<p align="left">
  <img src="https://img.shields.io/badge/Java-21-007396?logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring%20Boot-4.0.6-6DB33F?logo=springboot&logoColor=white" />
  <img src="https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven&logoColor=white" />
  <img src="https://img.shields.io/badge/Packaging-JAR-555555" />
</p>

---

## Overview

This repository contains the backend service for the EduHub platform.

The project is currently in its initial stage and has been bootstrapped using Spring Boot. It provides the base structure and configuration required to build a scalable RESTful backend service.

No business logic or domain-specific features have been implemented yet.

---

## Project Setup

The project was generated with the following configuration:

| Property     | Value                     |
| ------------ | ------------------------- |
| Group ID     | com.eduHub                |
| Artifact ID  | eduHub-backend            |
| Package Name | com.eduHub.eduHub-backend |
| Java Version | 21                        |
| Packaging    | JAR                       |
| Build Tool   | Maven                     |

---

## Dependencies

Current dependencies included during initialization:

* Spring Web (Spring MVC, embedded Tomcat)
* Spring Boot DevTools (development-time utilities)

---

## Project Structure

```id="ybnk4p"
src/
 ├── main/
 │   ├── java/com/eduHub/eduHub-backend/
 │   └── resources/
 │       └── application.properties
 └── test/
```

---

## Build and Run

### Build

```bash id="2z2l3c"
mvn clean install
```

### Run

```bash id="6l0f3a"
mvn spring-boot:run
```

Or run the packaged artifact:

```bash id="r6lmj7"
java -jar target/eduHub-backend.jar
```

---

## Configuration

Default configuration file:

```id="xw9yzt"
src/main/resources/application.properties
```

Environment-specific configurations can be introduced using Spring profiles as the project evolves.

---

## Current Status

* Project initialized
* Base configuration in place
* Hello World printed
* course service created
* material service created
* No APIs, or business logic implemented


---

## Roadmap

This section will be updated as development progresses to include:

* API design and endpoints
* Database integration
* Security configuration
* Observability and monitoring
* Deployment strategy

---

## License

To be defined.

---
