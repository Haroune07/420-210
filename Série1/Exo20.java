class Exo20{
	
	public static void main(String[] args){
		
		int[] array = {45, 12, 78, 34, 89, 21, 8, 50};
		
		quickSort(array, 0, array.length-1);
		
		for(int i : array) System.out.println(i + " ");
		
	}
	
	static void quickSort(int [] array, int start, int end){
		
		if(end <= start) return;
		
		int pivot = partition(array, start, end);
		
		quickSort(array, start, pivot-1);
		quickSort(array, pivot+1, end);
		
	}
	
	static int partition(int[] array, int start, int end){
		
		int i = start -1;
		int temp;
		int pivot = array[end];
		
		for(int j = start; j < end; j++){
			
			if(array[j] < pivot){
				
				i++;
				
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
			}
			
		}
		
		i++;
		
		temp = array[end];
		array[end] = array[i];
		array[i] = temp;
		
		return i;
		
	}
	
	
}