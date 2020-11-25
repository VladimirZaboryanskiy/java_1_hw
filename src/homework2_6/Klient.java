package homework2_6;


import java.io.*;
import java.net.Socket;

import java.util.Scanner;

public class Klient{

    private static BufferedReader in;
    private static PrintWriter out;
    private static Socket socket;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        try {
            try {

                socket = new Socket("localHost", 8180);
                System.out.println("Сервер подключен");
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

            } catch (Exception e) {
                e.printStackTrace();
            }
            Listenet listenet = new Listenet();
            listenet.start();
            String input = "", output = "";
            while (true) {

                if (output.equals("exit")) {
                    System.out.println("Клиент отключился");
                    break;
                }
                output = scan.nextLine();
                out.println("Клиент :" +output);
            }

        } finally {
            try {
                socket.close();
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






