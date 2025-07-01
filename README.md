# 💬 Java Local Chat with Sockets

This is a simple **local network chat application** built in **Java** using **TCP sockets**. It includes both **server and client** programs, enabling multiple users to communicate with each other through a common server.

## 📌 Features

- Real-time messaging between multiple clients
- Console-based interface
- Handles multiple connections using multithreading
- Works on local network
- Lightweight and beginner-friendly

## 🧠 Technologies Used

- Java SE (Standard Edition)
- java.net (Socket, ServerSocket)
- Multithreading (Thread)
- Console I/O (BufferedReader, PrintWriter)

## 🛠️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/RafaelMTA13/Chat_Serve_Java.git
cd java-socket-chat
```

> Replace `yourusername` with your actual GitHub username.

### 2. Compile the source files

```bash
javac ChatServer.java ChatClient.java
```

### 3. Run the server

```bash
java ChatServer
```

The server will start and wait for client connections on port `12345`.

### 4. Run the client

In a new terminal (or on another machine in the same local network):

```bash
java ChatClient
```

- Enter your name when prompted.
- Start chatting!

## 🖼️ Preview

```bash
[Client 1]
Enter your name: Agatha
Agatha: Hello!

[Client 2]
Enter your name: Rafael
💬 Alice: Hello!
Rafael: Hi Agatha!
```

## 📁 Folder Structure

```
📁 java-socket-chat/
├── ChatServer.java     # Server-side socket application
├── ChatClient.java     # Client-side socket application
└── README.md           # Project documentation
```

## 🔒 License

This project is open-source and free to use under the **MIT License**.

## 👤 Author

Developed by **Rafael Monteiro** as part of a personal portfolio and learning journey.  
Feel free to contribute or fork this project.
