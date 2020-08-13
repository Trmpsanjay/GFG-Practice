// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            obj.reverse(sc.next());
        }
	}
}
// } Driver Code Ends



class Solution {
    
    
    public void reverse(String str){
     Stack<Character> st = new Stack<>();
       int i =0;
       // put string into the stack
       while(i <= str.length()-1){
           st.push(str.charAt(i));
           i++;
       }
       //take out string and add to the new string and return
       String ans = "";
		while(st.size()!=0){
			ans = ans + st.pop();
		}
		System.out.println(ans);

    }

}
