package jour01;

/*
 * This is a simple program to calculate the total and tax of a product in Java
 */
public class Facture {
    public static void main(String[] args) {

        double prix = 49.99;
        int quantite = 3;
        double tarifHT = prix * quantite; // Declare a double and assign the value of prix * quantite to it
        System.out.println("Le total est " + tarifHT + "\n");

        double tva = 0.20; // Declare a double and assign the value 0.20 to it
        double taxe = tarifHT * tva; // Declare a double and assign the value of tarifHT * tva to it
        System.out.println("La taxe est " + taxe + "\n");

        double tarifTTC = tarifHT + taxe; // Declare a double and assign the value of tarifHT + tarifHT * taxe to it
        System.out.println("La taxe est " + tarifTTC + "\n");
    }
}
