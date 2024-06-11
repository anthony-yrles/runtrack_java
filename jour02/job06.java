package jour02;

/*
 * Write a program that displays the sum of all even numbers between 1 and 100.
 * And make the addition of each number to output the result
 */

public class job06 {
    public static void main(String[] args) {

        int somme = 0; // Initialize the sum variable

        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0 ) { // Check if the number is even
                somme += i; // Add the number to the sum
            }
        }
        System.out.println("La somme des nombres pairs entre 1 et 100 est : " + somme); // Output the result
    }
}
