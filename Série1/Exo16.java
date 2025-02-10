

class Exo16{

	public static void main(String[] args){
	
		int[] array = new int[5];
		int[] array2 = {20,41,2,5,1};
		int[] array3 = {20,41,2,5,2};
		
		for(int i =0; i < array.length; i++){
			array[i] = (int) Math.floor(Math.random()*50)+1;
		}
		
		printArray(array2);
		printArray(array3);
		
		System.out.println(compareArrays(array3, array2) ? "pareil" : "différent");
		
		
	}
	
	static void printArray(int[] array){
		
		String result = "[";
		
		for(int i = 0; i < array.length; i++){
			
			result+=array[i];
			result+= i != array.length-1 ? ',' : ']';
			
		}
		
		System.out.println(result);
	}
	
	
	static boolean compareArrays(int[] array1, int[] array2){
		
		if(array1.length != array2.length) return false;
		
		for(int i = 0; i < array1.length; i++) if(array1[i] != array2[i]) return false;
		
		return true;
		
	}

}