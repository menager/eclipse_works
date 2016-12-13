package Other;

import java.util.*;

public class Reverse {

	public static void main(String[] args){
		
		String s= "fart";
		
		System.out.println(reversed(s));
		
		
	}
	
	public static String reversed(String s){
		String reversed = "";
		char[] ch = s.toCharArray();
		Stack<Character> str = new Stack<>();
		for(int i = 0; i < s.length(); i++){
			str.push(ch[i]);
		}
		for(int i = 0; i< s.length(); i++){
			reversed += str.pop().toString();
		}
		
		return reversed;
	}
}
