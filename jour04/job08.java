package jour04;

import java.util.concurrent.*;

public class job08 {

    public static void main(String[] args) {
        int numThreads = 10; // Nombre de threads dans le pool
        long upperLimit = 10_000_000; // Limite supérieure pour le calcul
        long sum = 0;

        // Création du pool de threads
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        Future<Long>[] futures = new Future[numThreads];

        // Calcul de la plage de valeurs pour chaque thread
        long range = upperLimit / numThreads;

        for (int i = 0; i < numThreads; i++) {
            long start = i * range + 1;
            long end = (i == numThreads - 1) ? upperLimit : (i + 1) * range;
            futures[i] = executor.submit(new PartialSumCalculator(start, end));
        }

        // Récupération des résultats
        try {
            for (Future<Long> future : futures) {
                sum += future.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Arrêt du pool de threads
        executor.shutdown();

        System.out.println("La somme de tous les nombres de 1 à " + upperLimit + " est : " + sum);
    }
}

// Classe pour calculer la somme partielle dans une plage de valeurs
class PartialSumCalculator implements Callable<Long> {
    private long start;
    private long end;

    public PartialSumCalculator(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() {
        long sum = 0;
        for (long i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
