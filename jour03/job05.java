package jour03;

import java.util.HashSet;
import java.util.Set;

public class job05 {
    public static void main(String[] args) {
        int[] tableau = {3, 7, 3, 9, 8, 7, 2, 5, 2};

        Set<Integer> uniqueValues = new HashSet<>();

        for (int nombre : tableau) {
            uniqueValues.add(nombre);
        }

        System.out.println("Les valeurs uniques sont : ");
        for (int valeur : uniqueValues) {
            System.out.println(valeur);
        }
    }
}
