package jour01;

import java.util.Scanner;

public class job11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        System.out.println("Entrez une heure en nombre de minutes : "); // Output prompt
        int minutes = sc.nextInt(); // Read user input

        int hours = minutes / 60;
        int resultMinutes = minutes % 60;

        String hoursString = String.valueOf(hours);
        if (hoursString.length() == 1) {
            hoursString = "0" + hoursString;
        }
        String minutesString = String.valueOf(resultMinutes);
        if (minutesString.length() == 1) {
            minutesString = "0" + minutesString;
        }

        System.out.println(hoursString + ":" + minutesString); // Output the result

        sc.close();

    }    
}
