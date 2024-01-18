package tutorials.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {

    public static void main(String[] args) {
        final String serverAddress = "localhost";
        final int portNumber = 5555;

        try (Socket socket = new Socket(serverAddress, portNumber);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to the server. Type a message:");

            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);

                String serverResponse = in.readLine();
                System.out.println("Server response: " + serverResponse);

                System.out.println("Type another message (or press Ctrl+C to exit):");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

