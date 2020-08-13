/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-->0){
		    String a = sc.next();
		    String b = sc.next();
		    int i = 0;
		    int j=0;
		    String ans = "";
		    while(i<a.length() && j<b.length()){
		        ans = ans + a.charAt(i++);
		        ans = ans + b.charAt(j++);
		    }
		    while(i<a.length()){
		         ans = ans + a.charAt(i++);
		            
		    }
		     while(j<b.length()){
		         ans = ans + b.charAt(j++);
		            
		    }
		    System.out.println(ans);
		}
	
		
	}
}
