// { Driver Code Starts
import java.util.*;
public class MSP
{	
    public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-- != 0)
		{
			int n=sc.nextInt();
			ArrayList<String> s = new ArrayList<String>(n);
			for (int i=0;i<n;i++)
			    s.add(sc.next());
			String tt;
			tt=sc.next();
			GfG g=new GfG();
			ArrayList<String> res =g.findMatchedWords(s, tt);
			Collections.sort(res);
			for (int i = 0;i < res.size();i++)
			    System.out.print(res.get(i)+" ");
			System.out.println();

		}
	}
}// } Driver Code Ends


/*Complete the provided function*/

class GfG
{
/* The function returns an array of strings 
present in the dictionary which matches
the string pattern.
You are required to complete this method */
public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    ArrayList<String> list = new ArrayList<>();
	    HashMap<Character,Integer> dict1 = new HashMap<>();
	    String num ="";
	    for(int i=0;i<pattern.length();i++){
	        if(dict1.containsKey(pattern.charAt(i))){
	            dict1.put(pattern.charAt(i),dict1.get(pattern.charAt(i))+1);
	        }
	        else{
	            dict1.put(pattern.charAt(i),1);
	        }
	    }
	    for(int i=0;i<pattern.length();i++){
	       if(dict1.containsKey(pattern.charAt(i))){
	           String p=String.valueOf(dict1.get(pattern.charAt(i)));
	            num = num + p;
	        }
	    }
	    //System.out.println(num);
	    
	    for(int i=0;i<dict.size();i++){
	        String s = dict.get(i);
	        HashMap<Character,Integer> map = new HashMap<>();
	        for(int j=0;j<s.length();j++){
	            if(map.containsKey(s.charAt(j))){
	                map.put(s.charAt(j),map.get(s.charAt(j))+1);
	            }
	            else{
	                map.put(s.charAt(j),1);
	            }
	        }
	        String temp = "";
	        for(int j=0;j<s.length();j++){
	            if(map.containsKey(s.charAt(j))){
	                String p = String.valueOf(map.get(s.charAt(j)));
	                temp = temp +p;
	            }
	        }
	        //System.out.println(temp);
	        if(temp.equals(num)){
	            list.add(s);
	        }
	        
	        
	    }
	    
	    
	    return list;
	}
}
