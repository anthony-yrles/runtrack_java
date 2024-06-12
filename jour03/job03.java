package jour03;

public class job03 {
    public static void main(String[] args) {
        
        String[] myArray = {"Josette", "John", "Myrtille", "Marc"};

        System.out.println(myArray[1]);

        myArray[2] = "Mireille";

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
