import java.util.Arrays;

class Exo12{

	public static void main(String[] args){
	
		int[] array = new int[5];
		
		for(int i =0; i < array.length; i++){
			array[i] = (int) Math.floor(Math.random()*100)+1;
		}
		
		printArray(array);
		
		double avg = avg(array);
		
		System.out.println(avg);
	}
	
	static int reduce(int[] array){
		
		int result = 0;
		
		for(int i : array) result+= i;
		
		return result;
		
	}
	
	static void printArray(int[] array){
		
		String result = "[";
		
		for(int i = 0; i < array.length; i++){
			
			result+=array[i];
			result+= i != array.length-1 ? ',' : ']';
			
		}
		
		System.out.println(result);
	}
	
	static double avg(int[] array){
		
		return reduce(array) / (double) array.length;
	}

}