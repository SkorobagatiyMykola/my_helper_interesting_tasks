package ua.skorobahatyi.webapp.lesson12_networking;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;

public class DemoWebApp {
    @SneakyThrows
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8855)) {
            while (true) {
                try (var client = serverSocket.accept()) {
                    var reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                    var line = reader.readLine();
                    System.out.println(client.getInetAddress().getHostAddress()  +" - "+line);
                } catch (Exception e) {
                    System.out.println("Ooo noo!!!");
                }
            }
        }
    }
}

// 91.196.192.236