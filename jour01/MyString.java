package jour01;

public class MyString {
    public static void main(String[] args) {
        // Déclaration de la première variable de type String
        String variable1 = "Première variable";

        // Déclaration de la deuxième variable de type String avec new
        String variable2 = new String("Deuxième variable");

        // Déclaration de la troisième variable de type String en concaténant des chaînes
        String variable3 = "Troisière" + " variable";

        // Déclaration de la quatrième variable de type String avec la méthode String.format()
        String variable4 = String.format("Quatrième variable");

        // Affichage des variables
        System.out.println("Variable 1 : " + variable1);
        System.out.println("Variable 2 : " + variable2);
        System.out.println("Variable 3 : " + variable3);
        System.out.println("Variable 4 : " + variable4);
    }
}
