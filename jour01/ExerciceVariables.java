package jour01;

public class ExerciceVariables {
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 10;
        System.out.println("num1 = " + num1 + " et num2 = " + num2);
        int num = num1;
        num1 = num2;
        num2 = num;
        System.out.println("num1 = " + num1 + " et num2 = " + num2);
    }
}
