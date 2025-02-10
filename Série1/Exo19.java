import java.util.Arrays;

class Exo19{

	public static void main(String[] args){
	
		int[] array = new int[4];
		
		for(int i =0; i < array.length; i++){
			array[i] = (int) Math.floor(Math.random()*100)+1;
		}
		
		printArray(array);
		printArray(sortArray(array));
	}
	
	static void printArray(int[] array){
		
		String result = "[";
		
		for(int i = 0; i < array.length; i++){
			
			result+=array[i];
			result+= i != array.length-1 ? ',' : ']';
			
		}
		
		System.out.println(result);
	}
	
	static int[] sortArray(int[] array){
		
		int[] finalArr = new int[array.length];
		
		
		for(int i = 0; i < array.length; i++){

			int min = array[i];
						
			int tempIndex = i;
			
			int temp;
			
			
			for(int j = i; j < array.length; j++){
				
				if(min > array[j]) tempIndex = j;
				
				min = Math.min(array[j], min);
				
			}
			
			finalArr[i] = min;
			
			temp = array[i];
			array[i] = array[tempIndex];
			array[tempIndex] = temp;
			
		}
		
		return finalArr;
	}

}