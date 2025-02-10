
class Exo10{

	public static void main(String[] args){
	
		int[] array = new int[5];
		
		for(int i =0; i < array.length; i++){
			array[i] = (int) Math.floor(Math.random()*100)+1;
		}
		
		printArray(array);
		System.out.println(findExtreme(Extreme.MAX, array));
		System.out.println(findExtreme(Extreme.MIN, array));
	}
	
	static void printArray(int[] array){
		
		String result = "[";
		
		for(int i = 0; i < array.length; i++){
			
			result+=array[i];
			result+= i != array.length-1 ? ',' : ']';
			
		}
		
		System.out.println(result);
	}

	static int findExtreme(Extreme ex, int[] array){
		
		int value = array[0];
		
		if(ex == Extreme.MIN){
			
			for(int i = 0; i < array.length; i++){
				
				value = Math.min(array[i], value);
				
			}
			
		}
		
		else if(ex == Extreme.MAX){
			
			for(int i = 0; i < array.length; i++){
				
				value = Math.max(array[i], value);
				
			}
			
		}
		
		return value;
	}
	
	enum Extreme{
		MIN,MAX
	}
}