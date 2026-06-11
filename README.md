# AI Agents Repository

This repository contains specialized AI agents for various development tasks.

## Available Agents

### 1. Spring Boot API Generator
**Location**: `agents/springboot-api-generator/`

Generates complete, production-ready Spring Boot REST APIs from payload specifications.

**Capabilities**:
- Full project structure generation
- Entity and DTO creation
- REST controller implementation
- Service layer setup
- Database configuration
- Swagger documentation
- Validation and error handling

**How to use**:
```bash
# Provide a payload specification to the agent
# Agent generates complete API code with all necessary files
```

See [`agents/springboot-api-generator/README.md`](agents/springboot-api-generator/README.md) for detailed documentation.

## Agent Structure

Each agent folder contains:
- `.instructions.md` - Agent guidelines and responsibilities
- `.agent.md` - Agent configuration and prompt instructions
- `README.md` - Usage documentation and examples
- `example-payload.json` - Example input format
- Additional helper files as needed

## Getting Started

1. Choose an agent based on your task
2. Review the agent's README and example payloads
3. Prepare your input according to the agent's requirements
4. Use the agent with Claude to generate the solution

## Future Agents

Planned additions:
- React Component Generator
- Database Migration Tool
- Microservices Orchestrator
- Docker Configuration Generator
- CI/CD Pipeline Builder

---

**Last Updated**: 2026-06-11
