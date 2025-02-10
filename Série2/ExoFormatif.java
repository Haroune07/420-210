public class ExoFormatif{

	public static void main(String[] args){
	
		CompteBancaire compte = new CompteBancaire("Haroune Belhachani", 1000f);
		
		try{
			
			compte.afficherInfo();
		
			compte.afficherSolde();
		
			compte.déposer(150);
			compte.afficherSolde();
		
			compte.retirer(200);
			compte.afficherSolde();
		
			compte.retirer(compte.solde + 1);
			
		} catch(IllegalArgumentException e){ 
		
			System.out.println("Vous avez tenté de retirer plus que vous n'en possédez.");
			
		}
		
		
	}

}

class CompteBancaire{

	String titulaire;
	float solde;
	
	public CompteBancaire(String titulaire, float solde){
	
		this.titulaire = titulaire;
		this.solde = solde;
	}

	void déposer(float somme) { this.solde += somme; }
	
	void retirer(float somme) {
	
		if(somme > this.solde) throw new IllegalArgumentException("Le solde est insuffisant");
		else this.solde -= somme;
	
	}
	
	void afficherSolde(){
		
		System.out.printf("Solde du compte: %.2f %n", this.solde);
		
	}
	
	void afficherInfo(){
		
		System.out.printf("Titulaire : %s | Solde : %.2f %n", this.titulaire, this.solde);
		
	}
}