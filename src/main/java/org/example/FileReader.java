package org.example;

import java.io.File;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("C://My file/writer.txt");
        java.io.FileReader reader = new java.io.FileReader(file);
        char [] array = new char[4];
        reader.read(array);
        int index = -1;
        for (char c: array) {
            if (  c  ==  '0' ) {
                index = c;
                break;
            }
        }
        if (index  != -1) {
            System.out.println("Файл создан "  );
        } else {
            System.out.println(" ");
        }
        reader.close();
    }
}


