
public class Digits {
	public static void main(String args[]){

		String s = "puppies";
		
		char[] c = new char[s.length()];
		
		for(int i = 0; i < s.length()-1; i++){
			c[i] = 'a';
		}
		
		System.out.println(c);
	}
}
