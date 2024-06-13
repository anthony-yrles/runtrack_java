package jour03;

import java.util.Arrays;

public class job08 {
    public static void main(String[] args) {
        int[][] tableau = {
            {5, 9, 3},
            {7, 2, 8},
            {1, 6, 4}
        };

        System.out.println("Matrice avant le tri :");
        afficherMatrice(tableau);

        int[] elements = new int[tableau.length * tableau[0].length];
        int index = 0;
        for (int[] ligne : tableau) {
            for (int element : ligne) {
                elements[index++] = element;
            }
        }

        Arrays.sort(elements);

        index = 0;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau[i][j] = elements[index++];
            }
        }

        System.out.println("Matrice après le tri :");
        afficherMatrice(tableau);
    }

    public static void afficherMatrice(int[][] matrice) {
        for (int[] ligne : matrice) {
            for (int element : ligne) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
