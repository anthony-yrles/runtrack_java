package jour01;

/*
 * This is a simple program to swap the values of two variables in Java
 */

public class ExerciceVariables {
    public static void main(String[] args) {
        
        int num1 = 5; // Declare an integer and assign the value 5 to it
        int num2 = 10; // Declare an integer and assign the value 10 to it
        System.out.println("num1 = " + num1 + " et num2 = " + num2);
        int num = num1; // Declare an integer and assign the value of num1 to it
        num1 = num2; // Assign the value of num2 to num1
        num2 = num; // Assign the value of num to num2
        System.out.println("num1 = " + num1 + " et num2 = " + num2);
    }
}
