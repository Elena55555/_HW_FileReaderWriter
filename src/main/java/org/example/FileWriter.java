package org.example;

import java.io.*;
import java.util.Scanner;

public class FileWriter {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для записи");
        String message = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите что-нибудь еще");
        String message2 = scanner2.nextLine();

        File file = new File("C://My file/writer.txt");
        Scanner scanner3 = new Scanner(file);

        java.io.FileWriter writer = new java.io.FileWriter(file, true);
        writer.write(  message + '\n' + message2 + '\n');
        writer.close();

    }
}