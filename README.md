# Quiz Application

A full-stack Java Quiz Application built using Spring Boot, JSP, Hibernate/JPA, and MySQL. This project allows users to attend quizzes, navigate through questions, and view scores instantly after submission.

---

## Features

- Dynamic Quiz Generation
- Multiple Choice Questions
- Previous & Next Navigation
- Score Calculation
- Responsive Bootstrap UI
- MVC Architecture
- Database Integration using JPA/Hibernate

---

## Technologies Used

### Backend
- Java
- Spring Boot
- Spring MVC
- Hibernate / JPA

### Frontend
- JSP
- HTML
- CSS
- Bootstrap
- JavaScript

### Database
- MySQL

### Tools
- Maven
- Git
- GitHub
- Eclipse IDE

---

## Project Structure

```text
src
 ├── controller
 ├── service
 ├── repository
 ├── model
 ├── resources
 └── webapp
      └── WEB-INF
           └── jsp
```

---

## Screenshots

### Start Test Page
- Instructions before quiz starts

### Quiz Page
- Questions displayed one by one
- Next and Previous navigation

### Result Page
- Final score displayed after submission

---

## Database Tables

- quiz
- question
- option_table
- answer

---

## Future Improvements

- User Authentication
- Timer Functionality
- Admin Dashboard
- Result History
- Leaderboard
- Cloud Deployment

---

## Run Locally

### Clone Repository

```bash
git clone https://github.com/Udaykumarchalla/quizz_App.git
```

### Open Project

Import project into Eclipse or IntelliJ.

### Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/quizdb
spring.datasource.username=root
spring.datasource.password=yourpassword
```

### Run Application

```bash
mvn spring-boot:run
```

---

## Author

Uday Kumar Challa
