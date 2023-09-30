package org.example;
import java.io.*;
import java.util.Scanner;

public class Vuln {

    public static String readFromFile(String fileName) {
        try {
            File file = new File(fileName);
            StringBuilder content = new StringBuilder();

            if (file.exists()) {
                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                    content.append(scanner.nextLine()).append("\n");
                }

                scanner.close();
                return content.toString();
            } else {
                return "File not found";
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "An error occurred";
        }
    }

    public static void main(String[] args) {
        String userInput = "../../../../../etc/passwd";
        String result = readFromFile(userInput);
        System.out.println(result);
    }
}
