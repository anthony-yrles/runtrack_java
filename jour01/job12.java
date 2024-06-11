package jour01;

import java.util.Scanner;

public class job12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.println("Entrez un premier mot : "); // Output prompt
        String chaine1 = sc.nextLine(); // Read user input

        System.out.println("Entrez un deuxieme prenom : ");// Output prompt
        String chaine2 = sc.nextLine();// Read user input

        // Print the strings before the swap
        System.out.println("Avant l'échange :");
        System.out.println("Chaine 1 : " + chaine1);
        System.out.println("Chaine 2 : " + chaine2);

        // SWap the strings
        chaine1 = chaine1 + chaine2;
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length());
        chaine1 = chaine1.substring(chaine2.length());

        // Print the strings after the swap
        System.out.println("\nAprès l'échange :");
        System.out.println("Chaine 1 : " + chaine1);
        System.out.println("Chaine 2 : " + chaine2);

        sc.close();
    }
}
