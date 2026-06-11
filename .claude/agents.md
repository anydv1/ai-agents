# AI Agents - Claude Code Configuration

This directory contains custom AI agents for various development tasks.

## Quick Start

### Using the Spring Boot API Generator

1. **Prepare your payload** - Define the API specification in JSON format
2. **Invoke the agent** - Ask Claude: "Generate a Spring Boot API from this payload"
3. **Review output** - Agent generates complete project files
4. **Copy to your project** - Use the generated files in your project

### Example Usage

Ask Claude:
```
Using the Spring Boot API Generator agent, generate an API for this payload:
{
  "entityName": "User",
  "fields": [
    {"name": "id", "type": "Long", "constraints": ["@Id", "@GeneratedValue"]},
    {"name": "email", "type": "String", "constraints": ["@NotBlank", "@Email"]},
    {"name": "name", "type": "String", "constraints": ["@NotBlank"]}
  ],
  "endpoints": ["GET /users", "GET /users/{id}", "POST /users", "PUT /users/{id}", "DELETE /users/{id}"],
  "packageName": "com.example.user"
}
```

## Agent Locations

- **Spring Boot API Generator**: `agents/springboot-api-generator/`
  - Documentation: `agents/springboot-api-generator/README.md`
  - Example: `agents/springboot-api-generator/example-payload.json`
  - Configuration: `agents/springboot-api-generator/.agent.md`

## How It Works

1. Claude reads the `.instructions.md` for agent guidelines
2. Claude reads the `.agent.md` for the system prompt
3. Claude generates the solution based on your input
4. You review and use the generated code

## Tips

- Check `example-payload.json` for the expected input format
- Read `README.md` in each agent folder for detailed documentation
- Agents follow best practices for the technology they work with
- Output is always well-documented and production-ready

---

**Repository**: `git@github.com:anydv1/ai-agents.git`
**Local Path**: `C:\Users\Anupama Yadav\Documents\Learn\ai-agents`
