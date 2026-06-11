# 🚀 Quick Start Guide

## Setup Complete ✅

Your Spring Boot API Generator agent is ready to use!

**Location**: `C:\Users\Anupama Yadav\Documents\Learn\ai-agents`

## 📋 How to Use

### Step 1: Open the Project in Claude Code
```bash
cd C:\Users\Anupama Yadav\Documents\Learn\ai-agents
```

Then open with Claude Code.

### Step 2: Ask Claude to Generate an API

**Example Request**:
```
Generate a Spring Boot API using the agent for managing products with:
- Fields: id, name, description, price, quantity, status
- Endpoints: GET, POST, PUT, DELETE for products
- Database: MySQL
- Package: com.example.product
```

### Step 3: Review Generated Files

Claude will generate:
- Entity classes
- Controllers
- Services
- DTOs
- Configuration files (pom.xml, application.yml)
- Repository interfaces
- Exception handlers

### Step 4: Use the Generated Code

Copy the generated files to your Spring Boot project and run:
```bash
mvn spring-boot:run
```

## 📝 Example Payload Structure

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
    },
    {
      "name": "lastName",
      "type": "String",
      "constraints": ["@NotBlank", "@Size(min=2, max=50)"]
    }
  ],
  "endpoints": [
    "GET /api/users",
    "GET /api/users/{id}",
    "POST /api/users",
    "PUT /api/users/{id}",
    "DELETE /api/users/{id}"
  ],
  "database": "MySQL",
  "packageName": "com.example.user"
}
```

## 📚 Documentation

- Main README: [`README.md`](README.md)
- Agent Guide: [`agents/springboot-api-generator/README.md`](agents/springboot-api-generator/README.md)
- Example: [`agents/springboot-api-generator/example-payload.json`](agents/springboot-api-generator/example-payload.json)

## 🎯 Agent Features

✅ Full Spring Boot 3.x project generation  
✅ JPA/Hibernate entity mapping  
✅ REST controller creation  
✅ Service layer implementation  
✅ DTO generation  
✅ Validation & error handling  
✅ Swagger/OpenAPI documentation  
✅ Maven configuration  
✅ Database setup  
✅ Best practices included  

## 🔄 Workflow

1. Define your API structure (payload)
2. Ask Claude to generate using the agent
3. Review the generated code
4. Copy to your project
5. Build and run with Maven
6. Test the endpoints

## ❓ Tips

- Check `example-payload.json` for payload format
- Agent follows Spring Boot best practices
- All generated code is production-ready
- Customize the payload for your needs
- Generated code includes comments and documentation

---

**Ready to generate your first API!** 🎉

Ask Claude: "Generate a Spring Boot API for managing books with title, author, ISBN, and price fields."
