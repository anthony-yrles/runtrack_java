package jour04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Scanner;

public class job02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez la longueur de la chaîne de caractères à générer : ");
        int length = scanner.nextInt();
        scanner.close();

        Thread taskThread = new Thread(() -> {
            String randomString = generateRandomString(length);
            writeToFile(randomString);
        });

        long startTime = System.currentTimeMillis();

        taskThread.start();
        try {
            taskThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Temps d'exécution : " + executionTime + " ms");
    }

    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    private static void writeToFile(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./jour04/output.txt"))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
