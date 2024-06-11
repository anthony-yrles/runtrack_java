package jour01;

import java.util.Scanner;

public class job13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.println("Combien de chiffre voulez afficher : "); // Output prompt
        int n = sc.nextInt(); // Read user input

        String chaine = "";

        for (int i = 1; i <= n; i++) {
            if (i < n) {
                chaine += i + ",";
            } else {
                chaine += i + ".";
            }
        }

        System.out.println(chaine);
    }
}
