// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine().trim());
	    while(t > 0)
	    {
	        int n= Integer.parseInt(br.readLine().trim());
	        String x = br.readLine().trim();
	        String string_list[] = x.split(" ",n);
	        
	        Solution T = new  Solution();
	        
	        List <List<String>> ans = T.Anagrams(string_list);
	        
	        Collections.sort(ans, new Comparator<List<String>>(){
            public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);
                    
                    return s1.compareTo(s2);
                }
            });
	        
	        for(int i=0;i<ans.size();i++)
	        {
	            for(int j=0;j<ans.get(i).size();j++)
	            {
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	       
	       
            t--;
	    }
	}
    
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    public static boolean checkAnargam(String s1 , String s2) {
		if(s1.length()!=s2.length())
			return false;
		int arr1[] = new int[256];
		int arr2[] = new int[256];
		for(int i=0;i<s1.length();i++) {
			arr1[s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length();i++) {
			arr2[s2.charAt(i)]++;
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
	}
    public List<List<String>> Anagrams(String[] string_list) {
        if(string_list.length==0){
            List<List<String>> ans = new ArrayList<>();
            return ans;
        }
        List<List<String>> ans = new ArrayList<>();
        for(int i=0;i<string_list.length;i++){
            List<String> temp = new ArrayList<>();
            String s = string_list[i];
            if(s=="-1")
                continue;
            for(int j=i;j<string_list.length;j++){
                if(checkAnargam(s,string_list[j])){
                    temp.add(string_list[j]);
                    string_list[j]="-1";
                }
            }
            ans.add(temp);
        }
        return ans;
        
        
        
    }
}
