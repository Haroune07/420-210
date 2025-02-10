import java.util.Arrays;

class Exo14{

	public static void main(String[] args){
	
		int[] array = new int[5];
		int[] array2 = {1,2,4,3,5,6};
		
		for(int i =0; i < array.length; i++){
			array[i] = (int) Math.floor(Math.random()*100)+1;
		}
		
		printArray(array);
		printArray(array2);
		
		printArray(fuse(array, array2));
	}
	
	static void printArray(int[] array){
		
		String result = "[";
		
		for(int i = 0; i < array.length; i++){
			
			result+=array[i];
			result+= i != array.length-1 ? ',' : ']';
			
		}
		
		System.out.println(result);
	}
	
	static int[] fuse(int[] array1, int[] array2){
		
		int[] finalArray = new int[array1.length + array2.length];
		
		int i = 0;
		
		for(int num : array1) finalArray[i++] = num;
		for(int num : array2) finalArray[i++] = num;
		
		return finalArray;
		
	}

}