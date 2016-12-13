import java.util.HashSet;

public class UniqueChar {
	
	public static void main(String args[]){
		System.out.println(unique("abcd%66"));
	}

	public static boolean unique(String str){
		if(str.length() > 128) return false;
		boolean result = false;
		
		HashSet<Character> unique_char_set = new HashSet();
		for(int i = 0; i < str.length(); i++){
			result = unique_char_set.add(str.charAt(i));
			if(result == false)
				break;
		}
		
		return result;
	}
}
