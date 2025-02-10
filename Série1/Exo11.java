import java.util.Arrays;

class Exo8{

	public static void main(String[] args){
	
		int[] array = new int[5];
		
		for(int i =0; i < array.length; i++){
			array[i] = (int) Math.floor(Math.random()*100)+1;
		}
		
		printArray(array);
		printArray(reverseArray(array));
	}
	
	static void printArray(int[] array){
		
		String result = "[";
		
		for(int i = 0; i < array.length; i++){
			
			result+=array[i];
			result+= i != array.length-1 ? ',' : ']';
			
		}
		
		System.out.println(result);
	}
	
	static int[] reverseArray(int[] array){
		
		int[] finalArray = new int[array.length];
		
		for(int i = 0; i < finalArray.length; i++){
			
			finalArray[i] = array[array.length-1-i];
			
		}
		
		return finalArray;
	}

}