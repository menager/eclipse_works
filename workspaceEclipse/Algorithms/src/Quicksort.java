import java.util.Arrays;

public class Quicksort {

	public static void main(String args[]){
		int[] x = { 9, 2, 4, 7, 3, 7, 10 };
		System.out.println(Arrays.toString(x));
 
		int low = 0;
		int high = x.length - 1;
 
		quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
	}
	
	public static void quickSort(int[] arr, int left, int right){
		int index = partition(arr, left, right);
		//sort left half
		if(left < index-1){
			quickSort(arr, left, index-1);
		}
		//sort right half
		if(index < right){
			quickSort(arr, index, right);
		}
		
	}
	
	public static int partition(int[] arr, int left, int right){
		int pivot = arr[(left + right)/2]; 	// TODO pick a pivot point
		
		while (left <= right){ 				
			//find element on the left that should be on the right
			while(arr[left] < pivot) left++;
			
			//find element on the right that should be on the left
			while(arr[right] > pivot) right--;
			
			
			//swap elements and move left and right indicies
			if(left <= right){
				 // swaps elements
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return left;
		
	}
	

}
