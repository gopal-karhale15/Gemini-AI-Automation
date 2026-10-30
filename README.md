# Gemini AI Automation

A Java and Spring Boot-based AI application powered by the Google Gemini API. It provides an interactive chat interface where users can enter prompts and receive AI-generated responses.

## Features

- AI-powered responses using Google Gemini API
- Interactive chat interface
- Chat history saved in browser local storage
- Markdown response rendering
- Code syntax highlighting
- Copy code functionality
- Dark and light theme support
- REST API integration with Spring Boot

## Tech Stack

- **Language:** Java
- **Backend:** Spring Boot
- **AI Integration:** Google Gemini API
- **Frontend:** HTML, CSS, JavaScript
- **Build Tool:** Maven

## Project Structure

```text
Gemini-AI-Automation/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/geminiautomation/
│       │       ├── GeminiController.java
│       │       └── GeminiService.java
│       └── resources/
│           └── static/
│               └── index.html
├── pom.xml
├── mvnw
└── mvnw.cmd
```

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/gopal-karhale15/Gemini-AI-Automation.git
```

### 2. Open the Project

Open the project in IntelliJ IDEA or your preferred Java IDE.

### 3. Configure Google Gemini API Key

Set your Google Gemini API key as an environment variable.

**Windows PowerShell:**

```powershell
$env:GOOGLE_API_KEY="YOUR_API_KEY"
```

Replace `YOUR_API_KEY` with your own API key. Never commit API keys or other secrets to GitHub.

### 4. Run the Application

Using Maven Wrapper:

```bash
.\mvnw.cmd spring-boot:run
```

### 5. Open in Browser

```text
http://localhost:8080
```

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

**Built with Java · Spring Boot · Google Gemini API**
