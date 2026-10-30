# Gemini AI Automation

A Java and Spring Boot-based AI application powered by the Google Gemini API. It provides an interactive chat interface where users can enter prompts and receive AI-generated responses.

The application uses Redis caching to improve response time and Docker Compose to run the Spring Boot application and Redis together.

## Features

- AI-powered responses using Google Gemini API
- Interactive chat interface
- Redis-based response caching
- Docker containerization
- Docker Compose integration
- Chat history saved in browser local storage
- Markdown response rendering
- Code syntax highlighting
- Copy code functionality
- Dark and light theme support
- REST API integration with Spring Boot

## Tech Stack

- **Language:** Java 21
- **Backend:** Spring Boot
- **AI Integration:** Google Gemini API
- **Caching:** Redis
- **Containerization:** Docker
- **Orchestration:** Docker Compose
- **Frontend:** HTML, CSS, JavaScript
- **Build Tool:** Maven

## Project Structure

```text
Gemini-AI-Automation/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/geminiautomation/
│       │       ├── GeminiAutomationApplication.java
│       │       ├── GeminiController.java
│       │       └── GeminiService.java
│       └── resources/
│           ├── static/
│           │   └── index.html
│           └── application.properties
├── Dockerfile
├── docker-compose.yml
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/gopal-karhale15/Gemini-AI-Automation.git
cd Gemini-AI-Automation
```

### 2. Configure Google Gemini API Key

Generate your API key from Google AI Studio.

**Windows PowerShell:**

```powershell
$env:GOOGLE_API_KEY="YOUR_API_KEY"
```

Replace `YOUR_API_KEY` with your own API key.

Never commit API keys or other secrets to GitHub.

### 3. Run with Docker Compose (Recommended)

Make sure Docker Desktop is installed and running.

Set the API key in PowerShell:

```powershell
$env:GOOGLE_API_KEY="YOUR_API_KEY"
```

Build and start the application:

```bash
docker compose up --build
```

This starts:

- Spring Boot application on port `8080`
- Redis server on port `6379`

Open the application:

```text
http://localhost:8080
```

Stop the containers:

```bash
docker compose down
```

### 4. Run Locally Without Docker

Make sure Redis is running on port `6379`.

Set the Google Gemini API key:

```powershell
$env:GOOGLE_API_KEY="YOUR_API_KEY"
```

Run the application using Maven Wrapper:

```powershell
.\mvnw.cmd spring-boot:run
```

Open in browser:

```text
http://localhost:8080
```

## Redis Caching

The application uses Spring Cache with Redis to store Gemini API responses.

- Responses are cached using the prompt as the cache key.
- Repeated requests with the same prompt retrieve the cached response.
- This reduces unnecessary Gemini API calls and improves response time.

## API Endpoint

**Generate AI Response**

```http
POST /api/gemini/generate
Content-Type: application/json
```

Request:

```json
{
  "prompt": "Explain Java Spring Boot"
}
```

Response:

```json
{
  "response": "AI-generated response"
}
```

## Developer

**Gopal Karhale**

- GitHub: [@gopal-karhale15](https://github.com/gopal-karhale15)

---

If you find this project useful, consider giving it a star.

**Built with Java · Spring Boot · Google Gemini API · Redis · Docker**
