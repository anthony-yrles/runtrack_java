package jour04;

import java.util.Scanner;

public class job06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez la taille du tableau désiré : ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Saisissez la valeur de la case " + i + " : ");
            array[i] = scanner.nextInt();
        }

        scanner.close();

        final int[] totalCount = {0};

        long startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                totalCount[0] += array[i];
            }
        });

        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Somme des valeurs du tableau : " + totalCount[0]);
        System.out.println("Temps d'exécution : " + executionTime + " ms");
    }
}
