import java.util.Arrays;

class Exo15{

	public static void main(String[] args){
	
		int[] array = new int[5];
		
		for(int i =0; i < array.length; i++){
			array[i] = (int) Math.floor(Math.random()*100)+1;
		}
		
		printArray(array);
		
		System.out.println(findAllEvenNumbers(array));
	}
	
	static void printArray(int[] array){
		
		String result = "[";
		
		for(int i = 0; i < array.length; i++){
			
			result+=array[i];
			result+= i != array.length-1 ? ',' : ']';
			
		}
		
		System.out.println(result);
	}
	
	static int findAllEvenNumbers(int[] array){
		
		int evens = 0;
		
		for(int i : array) {
			
			evens += i % 2 == 0 ? 1 : 0;
			
		}
		
		return evens;
		
	}

}