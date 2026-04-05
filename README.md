📌 Project Overview
This project is a WhatsApp Chatbot Backend Simulation built using Java 17 and Spring Boot 3. It is designed as a lightweight service to handle incoming WhatsApp messages (simulated via JSON) and respond automatically based on predefined logic.

🚀 Features
RESTful Webhook: A POST endpoint /api/webhook to receive and process real-time messages.

Automated Responses: Intelligent reply logic (e.g., "Hi" → "Hello", "Bye" → "Goodbye").

SLF4J Logging: Professional logging of every incoming message with sender details and timestamps for audit trails.

Input Sanitization: Handles case-sensitivity and trailing spaces using equalsIgnoreCase() and trim().

Cloud Ready: Configured for seamless deployment on platforms like Render.

🛠️ Tech Stack
Backend: Java, Spring Boot (Web, DevTools)

Build Tool: Maven

Logging: SLF4J with Logback

Testing: Postman
