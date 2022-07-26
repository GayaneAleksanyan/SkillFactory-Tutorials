package threads.connectingServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        // создаем серверный сокет на порту 1234
        ServerSocket server = new ServerSocket(1234);

        while (true) {
            System.out.println("Waiting...");

            // ждем клиента
            Socket s = server.accept();
            System.out.println("Client connected!");

            // создаем клиента на своей стороне
            Client client = new Client(s);

            // запускаем поток
            Thread thread = new Thread(client);
            thread.start();

//            new Thread (new Client(s)).start();
        }
    }
}
