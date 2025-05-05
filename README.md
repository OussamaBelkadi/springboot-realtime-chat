# Spring Boot WebSocket Chat Application

A real-time chat application built using Spring Boot and WebSocket. This application enables multiple users to join a chat room and exchange messages in real-time.

## Features

- Real-time messaging using WebSocket
- User join/leave notifications
- Unique avatar colors for each user
- Responsive design
- SockJS fallback for browsers that don't support WebSocket

## Technologies

- Spring Boot
- WebSocket with STOMP protocol
- SockJS
- HTML/CSS
- JavaScript
- Maven

## Project Structure
src/ 
├── main/ 
│ ├── java/ 
│ │ └── com/example/ 
│ │ ├── config/ 
│ │ │ └── WebSocketConfig.java 
│ │ ├── controller/ 
│ │ │ └── ChatController.java 
│ │ └── model/ 
│ │ └── ChatMessage.java 
│ └── resources/
│ ├── static/ 
│ │ ├── css/ 
│ │ │ └── main.css 
│ │ ├── js/ │ │ │ └── main.js
│ │ └── index.html 
│ └── application.properties
## Getting Started

### Prerequisites

- JDK 17 or later
- Maven 3.8 or later

### Running the Application

1. Clone the repository:
```bash
git clone https://github.com/OussamaBelkadi/springboot-realtime-chat
```
2. Navigate to the project directory:
```bash
cd springboot-realtime-chat
```
3. Build the project using Maven:
```bash
mvn clean install
```
4. Run the application:
```bash
mvn spring-boot:run
```
5. Open your browser and navigate to `http://localhost:8080`.
6. Open multiple tabs or browsers to test the chat functionality.
7. Application Demo
8. ![Chat app Demo](/images_doc/chat-interface.png)
   A real-time chat application built using Spring Boot and WebSocket. This application enables multiple users to join a chat room and exchange messages in real-time.

## Features

- Real-time messaging using WebSocket
- User join/leave notifications
- Unique avatar colors for each user
- Responsive design
- SockJS fallback for browsers that don't support WebSocket

## Screenshots

### Login Screen
![Login Screen](images/login-screen.png)

### Chat Interface
![Chat Interface](images/chat-interface.png)
