package jour02;

import java.util.Scanner;

/*
 * Write a program that reads an integer and prints the number of digits in it.
 */

public class job08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter a number: ");
        int numero = sc.nextInt(); // Read user input

        String nString = Integer.toString(numero); // Convert int to string

        int count = 0;

        for (int i = 0; i < nString.length(); i++) {
            count++; // Count the number of digits
        }

        System.out.println(count); // Output the number of digits
        sc.close();
    }
}
