// Déclaration de la classe principale du programme
public class Exo21 {

    // Déclaration d'une constante pour le taux de taxe
    public static final double TAUX_DE_TAXE = 0.20;

    // Méthode principale qui sera exécutée lors du lancement du programme
    public static void main(String[] args) {
        // Déclaration de variables locales
        double prixInitial = 100.0; // Prix initial d'un produit
        double prixFinal = calculerPrixAvecTaxe(prixInitial); // Calcul du prix après taxe

        // Affichage du résultat
        System.out.println("Prix initial : " + prixInitial + "€");
        System.out.println("Prix final après application de la taxe : " + prixFinal + "€");
		
		double prixInit2 = 140;
		double rabais = 15;
		
		System.out.println("\nPrix initial : " + prixInit2 + "€");
        System.out.println("Prix final après application du rabais de " + rabais + "% : " + calculerPrixRabais(prixInit2, rabais) + "€");
    
		printReçu("xbox", 500, 20, 16);
	}

    // Méthode pour calculer le prix final avec taxe
    // Cette méthode prend le prix initial comme paramètre et retourne le prix après ajout de la taxe
    public static double calculerPrixAvecTaxe(double prix) {
        // Calcul du prix final en ajoutant la taxe
        double taxe = prix * TAUX_DE_TAXE; // Calcul de la taxe
        double prixAvecTaxe = prix + taxe; // Calcul du prix total avec taxe

        return prixAvecTaxe; // Retourne le prix final
    }
	
	/*
	@param prix le prix initial
	@param rabais en pourcentage (e.g, 20 pour 20%)
	*/
	static double calculerPrixRabais(double prix, double rabais) { return prix - prix / 100 * rabais; }
	
	static void printReçu(String name, float prix, float rabais, float taxPourcentage) {
    double remise = -(prix / 100 * rabais); // Calculate the discount (negative)
    double prixAvantTaxe = prix - remise; // Calculate the price before tax
    double taxe = prixAvantTaxe / 100 * taxPourcentage; // Calculate the tax
    double total = prixAvantTaxe + taxe; // Calculate the total price

    int totalChars = 60;

    // Calculate the space for each line
    String prixFormatted = String.format("%.2f$", prix);
    String remiseFormatted = String.format("%.2f$", remise);
    String prixAvantTaxeFormatted = String.format("%.2f$", prixAvantTaxe);
    String taxeFormatted = String.format("%.2f$", taxe);
    String totalFormatted = String.format("%.2f$", total);

    // The maximum length of the price string will be used to ensure alignment
    int maxLength = Math.max(Math.max(prixFormatted.length(), remiseFormatted.length()),
                             Math.max(prixAvantTaxeFormatted.length(),
                                      Math.max(taxeFormatted.length(), totalFormatted.length())));

    // Calculate the padding required to align the columns
    int priceSpace = totalChars - name.length() - maxLength;
    String rabaisStr = String.format("rabais(%d%%)", (int) rabais);
    int rabaisSpace = totalChars - rabaisStr.length() - maxLength;
    int prix_avant_taxeSpace = totalChars - "prix avant taxes".length() - maxLength;
    String taxeStr = String.format("taxe(%d%%)", (int) taxPourcentage);
    int taxSpace = totalChars - taxeStr.length() - maxLength;
    int totalSpace = totalChars - "total".length() - maxLength;

    // Print the receipt details with proper alignment
    System.out.printf("%-" + priceSpace + "s %" + maxLength + "s%n", name, prixFormatted);
    System.out.printf("%-" + rabaisSpace + "s %" + maxLength + "s%n", rabaisStr, remiseFormatted);
    System.out.printf("%-" + prix_avant_taxeSpace + "s %" + maxLength + "s%n", "prix avant taxes", prixAvantTaxeFormatted);
    System.out.printf("%-" + taxSpace + "s %" + maxLength + "s%n", taxeStr, taxeFormatted);
    System.out.printf("%-" + totalSpace + "s %" + maxLength + "s%n", "total", totalFormatted);
}

}