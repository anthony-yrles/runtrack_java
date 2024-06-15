package jour04;

import java.util.Scanner;

public class job04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez le nombre maximum à compter : ");
        int max = scanner.nextInt();
        scanner.close();

        long startTime = System.currentTimeMillis();
        final int[] count = {0};

        Thread thread = new Thread(() -> {
            for (int i = 0; i <= max; i++) {
                count[0]++;
            }
        });

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Nombre de tours de boucle : " + count[0]);
        System.out.println("Temps d'exécution : " + executionTime + " ms");
    }
}
