package jour02;

import java.util.Scanner;

public class job07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter a number: "); // Ask the user for a number
        int n = sc.nextInt();

        int factorielle = 1;

        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }

        System.out.println(factorielle);
        
        sc.close();
    }
}
