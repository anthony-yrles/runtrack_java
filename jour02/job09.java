package jour02;

/*
 * Write a program that reads an integer and prints the first and last digits of it.
 */

public class job09 {
    public static void main(String[] args) {
        
        int number = 1234; // The number to be analyzed

        String str = Integer.toString(number); // Convert int to string

        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                System.out.print("Le premier chiffre est " + str.charAt(i) + "\n");
            } else if (i == str.length() - 1) {
                System.out.print("Le dernier chiffre est " + str.charAt(i) + "\n");
            }
        }
    }
}
