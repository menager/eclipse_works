
public class FindRange {
	public static void main(String args[]){
		int[] arr = {50, 75};
		
		
		System.out.print(findRange(arr));
	}
	
	public static String findRange(int[] num){

	    String range = "";

    	if( num[0]>0 ){
    		range += "0-"+(num[0]-1)+",";
    	}

	    for(int i = 0; i < num.length-1; i++){
	    	range +=(num[i]+1)+"-"+(num[i+1]-1);
	    	if(i < num.length-2){
	    		range+= ",";
	    	}
	    }
	    
    	if(num[num.length-1] < 100){
    		range +=","+(num[num.length-1]+1)+"-"+"100";
    	}
	    
    	char[] d = range.toCharArray();
//    	System.out.println(d);
	    return range;
	}

}
