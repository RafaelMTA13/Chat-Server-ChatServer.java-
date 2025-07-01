import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(12345);
        System.out.println("🔌 Server started. Waiting for connections...");

        List<Socket> clients = new ArrayList<>();

        while (true) {
            Socket client = server.accept();
            clients.add(client);
            System.out.println("🟢 New client connected: " + client.getInetAddress());

            new Thread(() -> {
                try {
                    BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                    String message;
                    while ((message = in.readLine()) != null) {
                        System.out.println("📩 " + message);
                        for (Socket c : clients) {
                            if (c != client) {
                                PrintWriter out = new PrintWriter(c.getOutputStream(), true);
                                out.println(message);
                            }
                        }
                    }
                } catch (IOException e) {
                    System.out.println("❌ A client has disconnected.");
                }
            }).start();
        }
    }
}
