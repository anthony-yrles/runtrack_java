package jour01;

import java.util.Scanner;

public class job14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.println("Entrez un nombre : "); // Output prompt
        double n = sc.nextDouble(); // Read user input

        System.out.println("Entrez un autre nombre : "); // Output prompt
        double m = sc.nextDouble(); // Read user input

        System.out.println("La somme des deux nombre est égal à " + (n + m)); // Output prompt

        sc.close();
    }
}
