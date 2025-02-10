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
}