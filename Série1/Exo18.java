import java.util.Arrays;

class Exo18{

	public static void main(String[] args){
	
		int[] array = {1,4,3,5,9,4,5,2,1,6,4,2,1,0,3,4,0};
		
		printArray(array);
		
		printAppearances(countAppearances(array));
	}
	
	static void printArray(int[] array){
		
		String result = "[";
		
		for(int i = 0; i < array.length; i++){
			
			result+=array[i];
			result+= i != array.length-1 ? ',' : ']';
			
		}
		
		System.out.println(result);
	}
	
	static int[] countAppearances(int[] array){
		
		int[] finalArray = new int[11];
		
		for(int i = 0; i < array.length; i++){
			
			finalArray[array[i]]++;
			
		} 
		
		return finalArray;
		
	}
	
	static void printAppearances(int[] array){
		
		int i = 0;
		
		for(int j : array){
			
			if(j != 0) System.out.println(i + " : " + j);
			
			i++;
		}
		
	}

}