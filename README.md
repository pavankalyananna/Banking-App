  
# 🏦 Banking Application

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![REST API](https://img.shields.io/badge/API-REST-lightgrey)

A **simple Banking Application** built using **Java & Spring Boot**.  
This project focuses on clean REST API design, DTO mapping, and core banking operations.

---

## ✨ Features

- Create, read, update, and delete bank accounts
- Deposit and withdraw money
- Clean separation of **Entity ↔ DTO**
- RESTful API design using Spring Boot

---

## 🛠 Tech Stack

| Technology | Purpose |
|----------|--------|
| Java 17 | Core language |
| Spring Boot | REST API framework |
| Maven | Build & dependency management |

---

## 🚀 Getting Started

### 📌 Prerequisites

Make sure you have:
- **Java JDK 17+**
- **Maven**
- Any IDE (IntelliJ IDEA recommended)

---

### ▶️ Run the Application

#### 1️⃣ Clone the repository
```bash
git clone https://github.com/pavankalyananna/Banking-App.git
````

#### 2️⃣ Move into the project directory

```bash
cd Banking-App
```

#### 3️⃣ Build the project

```bash
mvn clean install
```

#### 4️⃣ Start the application

```bash
mvn spring-boot:run
```

#### 5️⃣ Access the API

```text
http://localhost:8080
```

---

## 📡 API Endpoints

| Method | Endpoint                      | Description           |
| ------ | ----------------------------- | --------------------- |
| POST   | `/api/accounts`               | Create a new account  |
| GET    | `/api/accounts/{id}`          | Fetch account details |
| PUT    | `/api/accounts/{id}/deposit`  | Deposit money         |
| PUT    | `/api/accounts/{id}/withdraw` | Withdraw money        |
| DELETE | `/api/accounts/{id}`          | Delete an account     |

---

## 🧪 Testing

Use **Postman**, **curl**, or any REST client to test the APIs.

---

## 📌 Notes

* This project is intended for **learning and demonstration purposes**
* No authentication or database persistence yet

---
