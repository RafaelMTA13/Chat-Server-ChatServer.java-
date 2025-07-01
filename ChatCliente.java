import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // Thread to receive messages
        new Thread(() -> {
            try {
                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("💬 " + message);
                }
            } catch (IOException e) {
                System.out.println("❌ Disconnected from server.");
            }
        }).start();

        // Send messages
        System.out.print("Enter your name: ");
        String name = keyboard.readLine();

        String text;
        while ((text = keyboard.readLine()) != null) {
            out.println(name + ": " + text);
        }

        socket.close();
    }
}
