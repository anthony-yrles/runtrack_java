package jour03;

import java.util.Random;

public class job06 {
    public static void main(String[] args) {
        int[] tableau = new int[10];

        Random random = new Random();

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(100);
        }

        System.out.println("Tableau de 10 nombres entiers aléatoires :");
        for (int nombre : tableau) {
            System.out.println(nombre);
        }
    }
}
