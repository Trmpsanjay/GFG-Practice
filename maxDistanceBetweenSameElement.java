// { Driver Code Starts
import java.util.Scanner;
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution ob = new Solution();
			System.out.println(ob.maxDistance(arr,n));
		
		t--;
		}
	}
}// } Driver Code Ends


// your task is to complete this function
class Solution
{
    int maxDistance(int arr[], int n)
    {
        int ans = Integer.MIN_VALUE;
	    HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
	    
	    for(int i=0;i<arr.length;i++){
	        if(map.containsKey(arr[i])){
	            ArrayList<Integer> temp = map.get(arr[i]);
	           // int a = temp.get(0);
	            int b = temp.get(1);
	            if(b<i){
	                temp.set(1,i);
	            }
	            
	        }else{
	            ArrayList<Integer> temp = new ArrayList<>();
	            temp.add(i);
	            temp.add(i);
	            map.put(arr[i],temp);
	        }
	    }
	    
	    for(int p : map.keySet()){
	        ArrayList<Integer> temp = map.get(p);
	        int a = temp.get(0);
	        int b = temp.get(1);
	        int diff = Math.abs(a-b);
	        ans = Math.max(ans,diff);
	    }
	    return ans;
    }
}
