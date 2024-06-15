package jour04;

import java.util.Scanner;

public class job07 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez la taille du tableau désiré : ");
        int size = scanner.nextInt();

        int halfSize = size / 2;
        int[] array = new int[halfSize];
        int[] array2 = new int[size - halfSize];

        for (int i = 0; i < halfSize; i++) {
            System.out.print("Saisissez la valeur de la case " + i + " : ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size - halfSize; i++) {
            System.out.print("Saisissez la valeur de la case " + (i + halfSize) + " : ");
            array2[i] = scanner.nextInt();
        }

        scanner.close();

        final int[] totalCount = {0};
        final int[] totalCount2 = {0};
        final int[] total = {0};

        long startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < array.length; i++) {
                totalCount[0] += array[i];
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < array2.length; i++) {
                totalCount2[0] += array2[i];
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        total[0] = totalCount[0] + totalCount2[0];

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Somme des valeurs du tableau : " + total[0]);
        System.out.println("Temps d'exécution : " + executionTime + " ms");
    }
}
