
public class Google_Task1 {

	public static void main(String args[]){
		System.out.print(solution(623315));
	}
	
    public static int solution(int X) {
        // write your code in Java SE 8
        		
		if((X < 10 )|| (X > 1000000000)){
			return -1;
		}
		
		String tmp = Integer.toString(X); 
		int[] digits = new int[tmp.length()];
		
		
		for(int i = 0; i < tmp.length(); i++){
			digits[i] = Character.getNumericValue(tmp.charAt(i));
		}
		
		int tempNumber = 0;
		int largest = 0;
		
		for(int i = 0; i < digits.length-1; i++){
			tmp ="";
			int newDig = (int) Math.ceil((double)((digits[i]+digits[i+1])/2));
		    
		    for(int j = 1; j < digits.length-1; j++){
				if(i == j-1){
					tmp +=  Integer.toString(newDig);
					tmp += Integer.toString(digits[j+1]);
				}
				else{
					tmp += Integer.toString(digits[j+1]);
				}
			}
		    
		   System.out.println(tempNumber = Integer.parseInt(tmp));
		    
		    if(tempNumber > largest){
		        largest = tempNumber;   
		    }
			
		}
		
		// delete when done with alg
		return largest;
    }
}
