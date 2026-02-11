# hello-java

This document summarizes how to create and run a Spring Boot Maven project in VS Code.

## 1) Install VS Code

- Install Visual Studio Code.
- Launch it after installation.

## 2) Install extensions

Install the following extension packs.

- Spring extensions (e.g., Spring Boot Extension Pack)
- Java extensions (e.g., Extension Pack for Java)
- Material Icon Theme
- Power Mode

## 3) Create a Maven project

1. Open the Command Palette in VS Code. (Windows: Ctrl+Shift+P)
2. Select `Spring Initializr: Create a Maven Project`.
3. Choose language `Java`, packaging `Jar`, and use the major Java version just below the latest version.
4. Enter Group/Artifact/Package information like the example below.

Example

- Group: `com.ubisam`
- Artifact: `example1`
- Package: `com.ubisam.example1`

After entering, the project folder structure is created like this.

```
Java
└─ com.ubisam
	└─ example1
		└─ com.ubisam.example1
```

## 4) Select dependencies

In Spring Initializr, select the dependencies below.

- Lombok
- Rest Repositories
- Spring Data JPA
- HyperSQL Database

## 5) Configure application.properties

Set `src/main/resources/application.properties` as follows.

```properties
spring.application.name=example1

# === JPA / Hibernate: SQL output and formatting ===
# Print SQL executed in the console.
spring.jpa.show-sql=true
# Format SQL output for readability.
spring.jpa.properties.hibernate.format_sql=true
# Explicitly enable Hibernate show_sql as well.
spring.jpa.properties.hibernate.show_sql=true

# === Auto-apply DDL ===
# For development: auto-update schema when entities change. (Use cautiously in production)
spring.jpa.hibernate.ddl-auto=update

# === Logging levels ===
# Set the default log level to INFO.
logging.level.root=INFO
# Log Hibernate SQL at INFO level.
logging.level.org.hibernate.SQL=INFO
# Log binding (parameter) values at TRACE level (for detailed parameter values).
logging.level.org.hibernate.orm.jdbc.bind=TRACE
```

## 6) Run the Spring Boot project

Run the following command from the project root.

```powershell
# Windows
.\mvnw spring-boot:run

# Linux/macOS
./mvnw spring-boot:run
```

Or run it via the `Spring Boot Dashboard` in VS Code.
