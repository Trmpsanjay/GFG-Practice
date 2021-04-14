// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


 // } Driver Code Ends


class Solution{

    public static int minIndexChar(String str, String pat){
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<pat.length();i++){
            set.add(pat.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(set.contains(ch)){
                return i;
            }
        }
        return -1;
    }
}

// { Driver Code Starts.

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    int res = new Solution().minIndexChar(s1, s2);
		    if (res != -1)
		        System.out.println(s1.charAt(res));
		    else
		        System.out.println("No character present");
		}
	}
}
  // } Driver Code Ends
