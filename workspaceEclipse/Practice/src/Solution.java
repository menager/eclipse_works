
public class Solution {

		public static void main(String args[]){
			int arr[] = {-1, 3, -4, 5, 1, -6, 2, 1};
			System.out.print(solution(arr));
		}
		
		public static int solution(int[] A){
			
			int sum = 0;
			int left= 0;
			int i;

			for (i = 0; i < A.length; i++){
				sum += A[i];
			}
			
			for(i = 0; i< A.length-1; i++){
				sum -= A[i];
				
				if(left == sum){
					return i;
				}
				
				left += A[i];
			}
			 
			return -1;
		}
	
}
