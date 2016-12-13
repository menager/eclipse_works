
/*
 * All elements in A are factors of x.
 * is a factor of all elements in .
 * 
 * 
 * */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Between {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int i=0; i < m; i++){
            b[i] = in.nextInt();
        }
        
        Arrays.sort(b);
        Arrays.sort(a);
        Boolean factor = true;
        for(int i = 1; i < m; i++){
        	if(b[i] % b[0] != 0){
        		factor = false;
        	}
        }
        
        if(factor == false){
        	System.out.print(0);
        }
        
        else{
        	List<Integer> list = new ArrayList<>();
        	for(int i = b[0]; i > 0; i--){
        		
        		for(int j = 0; j < n; j++){
        			if(i % a[i] == 0){
        				
        			}
        		}
        		
        	}
        	
        }

    }
    
}