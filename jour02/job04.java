package jour02;

/*
 * Write a program that displays all even numbers between 1 and 100 on the screen.
 */


public class job04 {
    public static void main(String[] args) {

        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0 ) { // Check if the number is even
                System.out.println(i); // Output the result of each iteration
            }
        }
    }
}
