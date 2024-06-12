package jour02;


public class job10 {
    public static void main(String[] args) {

        int numero = 1234;
        String nString = Integer.toString(numero); // Convert int to string

        int count = 0;

        // Loop through the string and add the digits
        for (int i = 0; i < nString.length(); i++) {
            // Check if the character is a digit
            char c = nString.charAt(i);
            if (Character.isDigit(c)) {
                // Add the digit to the count
                count += Character.getNumericValue(c);
            }
        }
        System.out.println(count);
    }
}
