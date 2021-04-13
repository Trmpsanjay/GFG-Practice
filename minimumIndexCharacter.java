// { Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            String patt = br.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.printMinIndexChar(str, patt));
        }
    }
}// } Driver Code Ends




class Solution{
    
    // Function to find the character in patt which is present in str at min index
    public static String printMinIndexChar(String str, String patt){
        
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<patt.length();i++){
            set.add(patt.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(set.contains(ch)){
                String s = Character.toString(ch);
                return s;
            }
        }
        return "$";
    
    }
    
}
