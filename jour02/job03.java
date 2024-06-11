package jour02;

import java.util.Scanner;

/*
 * Write a program that asks the user for a number and displays the multiplication table of this number.
  */

public class job03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a number: "); // Ask the user for a number
        int n = sc.nextInt();

        // Loop from 0 to 10
        for (int i = 0; i <= 10; i++) {
            int result = n * i;
            // Output the result of each multiplication
            System.out.println(i + " * " + n + " = " + result + "\n");
        }

        sc.close();
    }
}
