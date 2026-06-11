# Spring Boot API Generator Agent

This agent generates complete, production-ready Spring Boot REST APIs from payload specifications.

## Features

- ✅ Complete project structure generation
- ✅ Spring Boot 3.x setup with Maven
- ✅ JPA/Hibernate entity generation
- ✅ REST controller creation with CRUD operations
- ✅ Service layer implementation
- ✅ DTOs for request/response handling
- ✅ Validation and error handling
- ✅ Swagger/OpenAPI documentation
- ✅ Application configuration files
- ✅ Database configuration

## Usage

### Example Task

```json
{
  "entityName": "User",
  "fields": [
    {
      "name": "id",
      "type": "Long",
      "constraints": ["@Id", "@GeneratedValue"]
    },
    {
      "name": "email",
      "type": "String",
      "constraints": ["@NotBlank", "@Email", "unique: true"]
    },
    {
      "name": "firstName",
      "type": "String",
      "constraints": ["@NotBlank", "@Size(min=2, max=50)"]
    }
  ],
  "endpoints": ["GET /users", "GET /users/{id}", "POST /users", "PUT /users/{id}", "DELETE /users/{id}"],
  "database": "MySQL",
  "packageName": "com.example.user"
}
```

## What Gets Generated

1. **Project Structure**
   ```
   src/main/java/com/example/
   ├── entity/
   ├── controller/
   ├── service/
   ├── dto/
   ├── repository/
   └── config/
   ```

2. **Configuration Files**
   - pom.xml with all dependencies
   - application.yml
   - application-dev.yml
   - application-prod.yml

## Getting Started

1. Provide payload specification to the agent
2. Agent generates complete API code
3. Review the generated files
4. Copy to your project and run: `mvn spring-boot:run`

## Technologies

- Spring Boot 3.x
- Spring Data JPA
- Hibernate
- Maven
- Swagger/OpenAPI
