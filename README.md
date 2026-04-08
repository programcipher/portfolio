# Portfolio — Program Cipher

A professional portfolio and resume web application built with Java Spring Boot and Thymeleaf.

## Tech Stack

- **Backend:** Java 21, Spring Boot 3.4.4, Thymeleaf
- **Frontend:** HTML5, CSS3 (custom dark theme), vanilla JavaScript
- **Build:** Maven (wrapper included)
- **Deployment:** Docker, GitHub Actions

## Getting Started

### Prerequisites

- Java 21+ installed

### Run Locally

```bash
./mvnw spring-boot:run
```

Open [http://localhost:8080](http://localhost:8080) in your browser.

### Build JAR

```bash
./mvnw clean package
java -jar target/portfolio-1.0.0.jar
```

### Docker

```bash
docker build -t portfolio .
docker run -p 8080:8080 portfolio
```

## Project Structure

```
src/main/
├── java/com/programcipher/portfolio/
│   ├── PortfolioApplication.java
│   ├── config/PortfolioConstants.java
│   ├── controller/PortfolioController.java
│   ├── model/
│   │   ├── Project.java
│   │   ├── Experience.java
│   │   └── Skill.java
│   └── service/PortfolioDataProvider.java
└── resources/
    ├── application.yml
    ├── static/
    │   ├── css/style.css, animations.css
    │   ├── js/main.js
    │   └── images/
    └── templates/
        └── index.html
```

## Customisation

Edit `PortfolioConstants.java` to update personal details, bio, and links.
Edit `PortfolioDataProvider.java` to add or modify projects, skills, and experience.

## License

MIT
