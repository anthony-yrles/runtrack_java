package jour04;

import java.util.Scanner;

public class job05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez le nombre maximum à compter : ");
        int max = scanner.nextInt();
        scanner.close();

        long startTime = System.currentTimeMillis();
        int hallMax = max / 2;
        int SecondMalfMax = max - hallMax;

        final int[] count1 = {0};
        final int[] count2 = {0};

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i <= hallMax; i++) {
                count1[0]++;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i <= SecondMalfMax; i++) {
                count2[0]++;
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

        final int[] total = {count1[0] + count2[0]}; 
        

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Nombre de tours de boucle : " + total[0]);
        System.out.println("Temps d'exécution : " + executionTime + " ms");
    }
}
