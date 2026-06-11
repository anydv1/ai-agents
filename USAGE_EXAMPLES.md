# 📖 Usage Examples

## Example 1: Simple User API

**Request to Claude**:
```
Generate a Spring Boot API using the springboot-api-generator agent for a User entity with:
- id (Long, @Id, @GeneratedValue)
- email (String, @NotBlank, @Email, unique)
- firstName (String, @NotBlank, @Size(min=2, max=50))
- lastName (String, @NotBlank, @Size(min=2, max=50))
- createdAt (LocalDateTime, @CreationTimestamp)

Endpoints: GET all users, GET by ID, POST create, PUT update, DELETE
Package: com.example.user
Database: MySQL
```

**Expected Output**: Complete User entity, UserController, UserService, UserDTO, UserRepository, and configuration files.

---

## Example 2: Product Inventory API

**Request to Claude**:
```
Using the Spring Boot API Generator agent, generate an API for Product entity:

Fields:
- id: Long (@Id, @GeneratedValue)
- name: String (@NotBlank, @Size(min=3, max=100))
- description: String (@Size(max=1000))
- price: BigDecimal (@NotNull, @Positive, precision=10, scale=2)
- quantity: Integer (@NotNull, @PositiveOrZero)
- status: String (@NotBlank, enum: ACTIVE, INACTIVE)
- createdAt: LocalDateTime (@CreationTimestamp)
- updatedAt: LocalDateTime (@UpdateTimestamp)

Endpoints: Full CRUD + Search endpoint
Package: com.example.product
Database: PostgreSQL
Include: Pagination support, logging, Swagger docs
```

**Expected Output**: Full product management API with pagination and search.

---

## Example 3: Order Management API

**Request to Claude**:
```
Generate a Spring Boot API for Order management with:

OrderEntity:
- id: Long (@Id)
- orderNumber: String (unique, @NotBlank)
- customerId: Long (@NotNull)
- totalAmount: BigDecimal (@Positive)
- status: String (PENDING, PROCESSING, SHIPPED, DELIVERED)
- createdAt: LocalDateTime
- updatedAt: LocalDateTime

OrderItemEntity:
- id: Long
- orderId: Long (foreign key)
- productId: Long
- quantity: Integer
- price: BigDecimal

Endpoints: 
- GET /api/orders
- GET /api/orders/{orderId}
- POST /api/orders
- PUT /api/orders/{orderId}
- DELETE /api/orders/{orderId}
- GET /api/orders/{orderId}/items

Package: com.example.order
Database: MySQL 8.0
Include: Transaction management, validation
```

**Expected Output**: Complex order management system with relationships.

---

## Example 4: Blog API

**Request to Claude**:
```
Using Spring Boot API Generator, create a Blog API:

PostEntity:
- id: Long
- title: String (@NotBlank, @Size(min=5, max=200))
- content: String (@NotBlank, columnDefinition="TEXT")
- author: String (@NotBlank)
- status: String (DRAFT, PUBLISHED)
- views: Integer (@PositiveOrZero)
- createdAt: LocalDateTime
- updatedAt: LocalDateTime

Endpoints: CRUD for posts, GET published posts, Search by title
Package: com.example.blog
Database: MySQL
Add: Custom exception handling, API versioning (/api/v1/posts)
```

**Expected Output**: Blog post management API with publication workflow.

---

## Example 5: E-commerce Product Catalog

**Request to Claude**:
```
Generate comprehensive product catalog API:

CategoryEntity:
- id: Long
- name: String (unique, @NotBlank)
- description: String

ProductEntity:
- id: Long
- name: String (@NotBlank)
- category: Category (foreign key)
- price: BigDecimal (@Positive)
- stock: Integer
- rating: Double
- createdAt: LocalDateTime

Endpoints:
- GET /api/categories
- POST /api/categories
- GET /api/products
- GET /api/products/search?name=&category=
- POST /api/products
- PUT /api/products/{id}

Package: com.example.ecommerce
Database: PostgreSQL
Features: Filtering, pagination, sorting, validation
```

**Expected Output**: Full-featured product catalog system.

---

## Tips for Best Results

1. **Be specific about fields and constraints** - The agent works better with detailed specifications
2. **Mention database preference** - MySQL, PostgreSQL, H2, etc.
3. **Request specific features** - Pagination, search, logging, Swagger
4. **Define relationships** - If you have multiple entities
5. **Specify endpoints** - List all endpoints you need

## Common Patterns

### Pattern 1: Simple CRUD
```json
{
  "entityName": "Item",
  "fields": [{"name": "id", "type": "Long"}, {"name": "name", "type": "String"}],
  "endpoints": ["GET", "POST", "PUT", "DELETE"],
  "packageName": "com.example.item"
}
```

### Pattern 2: With Status
```json
{
  "entityName": "Task",
  "fields": [..., {"name": "status", "type": "String", "constraints": ["enum: PENDING, DONE"]}],
  "endpoints": ["GET", "POST", "PUT", "DELETE", "PATCH /tasks/{id}/status"],
  "packageName": "com.example.task"
}
```

### Pattern 3: With Timestamps
```json
{
  "entityName": "Record",
  "fields": [..., {"name": "createdAt", "type": "LocalDateTime", "constraints": ["@CreationTimestamp"]}, {"name": "updatedAt", "type": "LocalDateTime", "constraints": ["@UpdateTimestamp"]}],
  "packageName": "com.example.record"
}
```

---

**Pro Tip**: Copy and modify these examples for your specific use cases!
