package jour01;

import java.util.Scanner;

/*
 * 1. Demander à l'utilisateur de saisir un mot
 * 2. Demander à l'utilisateur de saisir un prénom
 * 3. Afficher le message "Bonjour" suivi du mot et du prénom saisis
 */

public class job10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.println("Entrez un mot : "); // Output prompt
        String name = sc.nextLine(); // Read user input

        System.out.println("Entrez un prenom : ");// Output prompt
        String surname = sc.nextLine();// Read user input

        System.out.println("Bonjour " + name + " " + surname); // Output the result
    }
}
