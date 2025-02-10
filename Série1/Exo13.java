import java.util.Arrays;
import java.util.LinkedHashMap;


class Exo13{

	public static void main(String[] args){
	
		int[] array = new int[5];
		
		for(int i =0; i < array.length; i++){
			array[i] = (int) Math.floor(Math.random()*10)+1;
		}
		
		printArray(array);
		
		printArray(eraseDuplicates(array));
	}
	
	static int reduce(int[] array){
		
		int result = 0;
		
		for(int i : array) result += i;
		
		return result;
		
	}
	
	static void printArray(int[] array){
		
		String result = "[";
		
		for(int i = 0; i < array.length; i++){
			
			result += array[i];
			result += i != array.length-1 ? ',' : ']';
			
		}
		
		System.out.println(result);
	}
	
	static double avg(int[] array){
		
		return reduce(array) / (double) array.length;
	}

	static int[] eraseDuplicates(int[] array){
		
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		
		for(int i =0; i < array.length; i++){
			
			map.put(array[i], 1);
			
		}
		
		int[] finalArray = new int[map.size()];
		int i =0;
		
		for(Integer key: map.keySet()) finalArray[i++] = key;
		
		return finalArray;
		
	}
}