package GoDaddy;
import java.util.*;

public class SubString {

	public static void main(String[] args){
		
		String s = "I am using hackerrank to learn programming fart and stuff";
		String t = "am hackerrank to learn";
		String[] str = missingWords(s, t);
		for(int i = 0; i< str.length; i++){
			System.out.println(str[i]);
		}
	}
	
	static String[] missingWords(String s, String t){
		
		String[] str_s = s.split(" ");
		String[] str_t = t.split(" ");
		Map<String, Boolean> map = new HashMap<>();
		
		for(String word: str_t){
			map.put(word, true);
		}
		
		List<String> missing = new ArrayList<>();
		for(int i =0; i < str_s.length; i++){
			if(!map.containsKey(str_s[i])){
				missing.add(str_s[i]);
			}
		}
		
		String[] ansStr = missing.toArray(new String[missing.size()]);
		return ansStr;
		
	}
}
