
import java.util.*;
import java.io.*;

public class ReverseString {
	public static void main(String[] args){
		
		Scanner stdin = new Scanner(System.in);
		
		int numTest = stdin.nextInt();
		String[] testStr = new String[numTest];
		stdin.nextLine();
		
		for(int i = 0; i < numTest; i++){
			testStr[i] = stdin.nextLine();
		}
		
		if(testStr.length > 0){
			for(int i = 0; i <testStr.length; i++){
				int caseNumber = i+1;
				System.out.println("Case #"+(caseNumber)+": "+reverseStr(testStr[i]));
			}
		}
		stdin.close();
	}
	
	public static String reverseStr(String str){
		String[] words = str.split(" ");
		String reverse = new String();
		
		for(int i = words.length -1; i >= 0; i--){
			reverse += words[i]+ " ";
		}
		
		return reverse;
	}
}
