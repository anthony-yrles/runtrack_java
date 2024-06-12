package jour02;

public class job12 {
    public static void main(String[] args) {
        
        int[] sixfaces = {1, 2, 3, 4, 5, 6};
        int totalPossibilities = 0;

        for (int i = 0; i < sixfaces.length; i++) {
            for (int j = 0; j < sixfaces.length; j++) {
                for (int k = 0; k < sixfaces.length; k++) {
                    int total = sixfaces[i] + sixfaces[j] + sixfaces[k];
                    System.out.println(sixfaces[i] + " " + sixfaces[j] + " " + sixfaces[k] + " = " + total);
                    totalPossibilities++;
                }
            }
        }
        System.out.println("Total possibilities: " + totalPossibilities);
    }
}
