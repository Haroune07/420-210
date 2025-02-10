class Exo71{

	public static void main(String[] args){
		
		byte totalChars = 30;
		Scanner sc = new Scanner(System.in);
	
		String[] plats = {"Crevette", "Salade", "Frite", "Hamburger", "Gâteau"};
		float[] prix = {8.99f, 5.60f, 6.40f, 10.99f, 7.99f};
		
		byte[] platsChoisis = new byte[plats.length];
		
		byte choix = -1;
		
		float total = 0;
		
		while(choix != 4){
			
			printMenu(total);
			
			System.out.print("Entrez votre choix: ");
			choix = sc.nextByte();
			sc.nextLine();
			
			switch(choix){
				
				
				case 1:
				
					System.out.print("Entrez Le numéro d'item: ");
					byte num = sc.nextByte();
					sc.nextLine();
					
					System.out.printf("Plat ajouté :  %s", plats[num]);
					
					
					platsChoisis[num]++;
				
				break;
				
				case 2:
					
					System.out.print("Entrez Le numéro d'item: ");
					byte num = sc.nextByte();
					
					System.out.printf("Plat retiré :  %s%n", plats[num]);
					
					platsChoisis[num]--;
					
				break;
				
				case 3:
					list.printAll();
				break;
				
				case 4:
				System.out.println("Au revoir");
				break;
				
			}
			
			total = calculerTotal();
		}
	
	}
	
	static float calculerTotal(byte[] platsChoisis, float[] prix){
		
		float total = 0;
		
		for(int i = i < prix.length; i++){
			total += platsChoisis[i] * prix[i];
		}
		
		return total;
		
	}
	
	static void printRecu(){
		
	}
	
	static void printMenu(float total){
		
		System.out.println("\nMenu :");
		System.out.println("1. Ajouter un item");
		System.out.println("2. Retirer un item");
		System.out.println("3. Afficher le recu");
		System.out.println("4. Terminer la transaction");
		
		System.out.printf("Total de la facture actuelle : %.2f$%n", total);
		
	}

	static void write(byte totalChars, String word1, String word2){

        System.out.print(word1);

        for(int i = 0; i < totalChars - word1.length() - word2.length(); i++) System.out.print(' ');

        System.out.println(word2);

    }

}