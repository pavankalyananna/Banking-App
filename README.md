
# Banking-App

A simple **Banking Application** built in Java using Spring Boot.  
This application demonstrates account management, DTO mapping, and basic banking operations.

## Features

- Create, read, update, and delete bank accounts
- Map between entity and DTO using a mapper
- Uses Spring Boot for RESTful API development

## Technologies Used

- Java 17
- Spring Boot
- Maven


## Getting Started

### Prerequisites

- Java JDK 17+
- Maven
- IDE (IntelliJ IDEA, Eclipse, etc.)

### Run the Application

1. Clone the repository:
```bash
git clone https://github.com/pavankalyananna/Banking-App.git
````

2. Navigate to the project directory:

```bash
cd Banking-App
```

3. Build the project:

```bash
mvn clean install
```

4. Run the Spring Boot application:

```bash
mvn spring-boot:run
```

5. The API will be available at:

```
http://localhost:8080/
```

## Usage

You can test the APIs using **Postman** or any REST client.
Typical endpoints include:

* `POST /api/accounts` - Create a new account
* `GET /api/accounts/{id}` - Get account details
* `PUT /api/accounts/{id}/deposit` - deposit 
* `PUT /api/accounts/{id}/withdraw` - withdraw 
* `DELETE /api/accounts/{id}` - Delete account


