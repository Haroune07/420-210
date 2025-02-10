
class Exo7{

	public static void main(String[] args){
	
		int[] array = new int[5];
		
		for(int i =0; i < array.length; i++){
			array[i] = (int) Math.floor(Math.random()*100)+1;
			System.out.print(array[i] + " ");
		}

	}

}