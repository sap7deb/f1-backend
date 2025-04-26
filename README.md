
# 🏎️ Formula 1 Seasons Backend API

Welcome to the **Formula 1 Database API**, a modular **Spring Boot** backend to manage and query Formula 1 racing data such as Seasons, Circuits, Races, Drivers, Constructors, and Race Results.

This project uses **Spring Boot**, **JPA (Hibernate)**, and **SQLite** for fast, lightweight storage — built to be **clean**, **modular**, and **easily extendable**.

---

## 📚 Project Structure

- **Entities**
    - `Season`, `Circuit`, `Race`, `Driver`, `Constructor`, `Result`
- **DTOs**
    - Light-weight data transfer objects for each entity.
- **Repositories**
    - Extend `JpaRepository` for CRUD operations.
- **Services**
    - Handle business logic.
- **Controllers**
    - Expose REST APIs.

---

## 🚀 API Endpoints

| Module | URL | Method | Description |
|:-------|:----|:-------|:------------|
| **Season** | `/api/v1/seasons` | `GET` | Get all F1 seasons |
| **Circuit** | `/api/v1/circuits` | `GET` | Get all circuits |
| **Race** | `/api/v1/races` | `GET` | Get all races |
| **Race** | `/api/v1/races/circuit/{circuitId}` | `GET` | Get all races at a particular circuit |
| **Race** | `/api/v1/races/{raceId}/results` | `GET` | Get race results for a specific race |
| **Race** | `/api/v1/races/winners/{year}` | `GET` | Get all race winners for a particular season |
| **Driver** | `/api/v1/drivers` | `GET` | Get all drivers |
| **Constructor** | `/api/v1/constructors` | `GET` | Get all constructors |

---

## 🛠️ Technologies Used

- Java 17+
- Spring Boot 3
- Spring Data JPA
- Hibernate ORM
- SQLite Database
- Lombok
- Maven

---

## 🧩 How To Run Locally

1. **Clone the Repository**

```bash
git clone git@github.com:sap7deb/f1-backend.git
cd f1-backend-api
```

2. **Update application.properties**

```properties
# src/main/resources/application.properties
spring.datasource.url=jdbc:sqlite:f1db.sqlite
spring.datasource.driver-class-name=org.sqlite.JDBC
spring.jpa.database-platform=org.hibernate.dialect.SQLiteDialect
spring.jpa.hibernate.ddl-auto=none
```

3. **Add Your SQLite Database**

- Place your `f1db.sqlite` file under the project root or configure the path.
- The database must have tables: `seasons`, `circuits`, `races`, `drivers`, `constructors`, `race_data`.

4. **Build and Run**

```bash
./mvnw spring-boot:run
```

The API will start at:  
➡️ `http://localhost:8080/api/v1`

---

## 🧹 Future Enhancements

- Add Pagination & Sorting.
- Implement Search endpoints (by driver name, constructor, etc.).
- JWT-based Authentication for protected endpoints.
- Unit Tests and Integration Tests.

---

## 👨‍💻 Developer

| Name              | GitHub |
|:------------------|:-------|
| **Saptarshi Deb** | [@sap7deb](https://github.com/sap7deb) |

---

## 📜 License

This project is licensed under the **MIT License** — feel free to use and modify!

---

# 📣 Quick Preview

✅ Swagger UI: http://localhost:8080/swagger-ui.html

✅ API Docs: http://localhost:8080/api-docs

✅ Get all seasons → `GET /api/v1/seasons`

✅ Get all circuits → `GET /api/v1/circuits`

✅ Get all race results for a race → `GET /api/v1/races/{raceId}/results`

✅ Get all winners of a year → `GET /api/v1/races/winners/{year}`
