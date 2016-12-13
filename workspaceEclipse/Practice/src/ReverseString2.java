import java.util.Scanner;

public class ReverseString2 {
	
	public static void main(String args[]){
		
		Scanner stdin = new Scanner(System.in);
		String str = stdin.nextLine();
		
		System.out.println(reverseStr(str));
		
	}
	
	public static String reverseStr(String str){

		String reverse = new String();
		
		for(int i = str.length() -1; i >= 0; i--){
			reverse += str.charAt(i);
		}
		
		return reverse;
	}
}
