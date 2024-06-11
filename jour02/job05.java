package jour02;

import java.util.Scanner;

/*
 * Write a program that asks the user for their age and displays a message according to the following conditions:
 */

public class job05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.println("Quel est votre age? : "); // Ask the user for a number
        int age = sc.nextInt();

        // Check the age and display the appropriate message
        if (age < 16) {
            System.out.println("Vous ne pouvez pas travailler.");
        } else if (age > 55 && age < 67) {
            System.out.println("Vous allez avoir du mal a trouver un emploi.");
        } else if (age >= 67) {
            System.out.println("Vous êtes à la retraite.");
        }  else {
            System.out.println("Vous pouvez travailler tranquillou billou.");
        }

        sc.close(); // Close the Scanner
    }    
}
