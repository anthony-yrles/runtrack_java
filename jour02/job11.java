package jour02;

import java.util.Scanner;

/*
 * Write a program that reads an integer and prints a triangle of stars.
 */

public class job11 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create a Scanner object
    
        System.out.println("How many line for yout triangle: "); // Ask the user for a number
        int n = sc.nextInt(); // Read user input
    
        // Loop through the string and add the digits
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
