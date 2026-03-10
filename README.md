# Microservices Project

This project demonstrates a basic **Microservices Architecture** using **Spring Boot**, **Eureka Server**, and **API Gateway**. It includes multiple services communicating with each other and integrates with a database.

## 🚀 Project Structure

```
microservices_Project/
├── eureka-server
├── api-gateway
├── service-a
├── service-b
```

### ✅ Eureka Server
Acts as the service registry.. All microservices register themselves here.

### ✅ API Gateway
Handles routing to appropriate services using service discovery through Eureka.

### ✅ Service A
A sample microservice that exposes REST APIs and connects to the database.

### ✅ Service B
Another microservice that consumes Service A's APIs via the API Gateway.

---

## 🔗 Service Communication

- All services register with the **Eureka Server**.
- **API Gateway** handles routing to each service using Eureka.
- Services use **RestTemplate** or **OpenFeign** for inter-service communication.

---

## 💻 Running the Project

1. **Start Eureka Server**
2. **Start API Gateway**
3. **Start Service A and Service B**

Each service will register with Eureka and be accessible via the API Gateway.

---

## 📸 Screenshots

### 🔍 Eureka Dashboard

All services successfully registered:

<img width="1437" alt="Screenshot 2025-06-13 at 1 00 48 PM" src="https://github.com/user-attachments/assets/11fc1a23-acb3-415d-8fa2-ccfa8270a4a6" />


> 💡 Note: Make sure you place the screenshot at `microservices_Project/screenshots/eureka-dashboard.png` or adjust the path accordingly.

---

## 🗃️ Database Integration

- Service A is connected to a relational database (e.g., MySQL/PostgreSQL).
- Configuration is done using `application.yml` or `application.properties`.

---

## 🔗 GitHub Repository

[👉 Click here to view the project on GitHub](https://github.com/Sumitrazz/microservices_Project)

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Cloud Eureka
- Spring Cloud Gateway
- REST APIs
- MySQL / PostgreSQL (as DB)
- Maven

---

## 📬 Contact

For any queries or collaborations, feel free to reach out via [GitHub](https://github.com/Sumitrazz).
