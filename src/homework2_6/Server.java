package homework2_6;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {
    private static BufferedReader in;
    private static PrintWriter out;
    private static Socket socket;
    private static ServerSocket servers;
    private static Socket socketCl;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
try{
        try {
            servers = new ServerSocket(8180);
            System.out.println("Сервер запущен");
            socket = servers.accept();
            System.out.println("Клиент подключен");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("создание второго сервера");

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Listenet listenet = new Listenet();
        listenet.start();
        String input = "", output = "";
        while (!output.equals("exit")) {
            output = scan.nextLine();
            out.println("Сервер :" + output);
        }
     } finally {
    try {
        socket.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    try {
        servers.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    }
    private static class Listenet extends Thread {
        public void run() {

            while (true) {
                try {
                    String input = in.readLine();
                    System.out.println(input);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
