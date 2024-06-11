package jour02;

import java.util.Scanner;

public class job03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            int result = n * i;
            System.out.println(i + " * " + n + " = " + result + "\n");
        }

        sc.close();
    }
}
