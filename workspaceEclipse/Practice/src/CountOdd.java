import java.util.Scanner;

public class CountOdd {
	public static void main(String args[]){
		Scanner stdin = new Scanner(System.in);
		String strInput = stdin.nextLine();
		int oddCount = count(strInput);
		System.out.println("Number of odd numbers in string: "+oddCount);
		
		String s ="1,2,3,4,5,11,12,13";
		System.out.println(countWithCommas(s));
	}
	
	public static int count(String str){
		
		int oddCount = 0;
		for(int i = 0; i< str.length(); i++){
			if(Character.getNumericValue(((str.charAt(i)))) %2 !=0 ){
				oddCount++;
			}
			
		}
		
		
		return oddCount;
	}
	
	public static int countWithCommas(String str){
		
		String[] num = str.split(",");
		int oddCount = 0;
		for(int i = 0; i< num.length; i++){
			if(Integer.valueOf(num[i]) %2 != 0){
				oddCount++;
			}
		}
		
		return oddCount;
		
	}
}
