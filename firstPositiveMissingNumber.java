/*
Below un commented Code will be Not accepted at leetcode so following is correct
class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0){
            return 1;
        }
        int ans = 1;
        
           Arrays.sort(nums);
        //   for(int i=0;i<size;i++){
        //       System.out.print(arr[i]+" ");
        //   }
           for(int i=0;i<nums.length;i++){
               if(nums[i]<=0){
                   continue;
               }
              else if(nums[i]==0){
                  continue;
              }
               else if((i+1) <=(nums.length-1) && nums[i]==ans && nums[i+1]==ans){
                   continue;
               }
               else if((i+1) <=(nums.length-1) && nums[i]==ans && nums[i+1]!=ans){
                   ans++;
               }
               else if(nums[i]!=ans)
                    return ans;
                else
                    continue;
           }
           if(nums[nums.length-1]<=0)
               return 1;
           return nums[nums.length-1]+1;

        
    }
}

For o(n) time
https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/


*/


// { Driver Code Starts
import java.util.*;


 // } Driver Code Ends


class Missing{
    
    // function to find first positive missing number
    static int missingNumber(int arr[], int size)
    {
        int ans = 1;
        
           Arrays.sort(arr);
        //   for(int i=0;i<size;i++){
        //       System.out.print(arr[i]+" ");
        //   }
           for(int i=0;i<size;i++){
               if(arr[i]<=0){
                   continue;
               }
              else if(arr[i]==0){
                  continue;
              }
               else if((i+1) <=(size-1) && arr[i]==ans && arr[i+1]==ans){
                   continue;
               }
               else if((i+1) <=(size-1) && arr[i]==ans && arr[i+1]!=ans){
                   ans++;
               }
               else if(arr[i]!=ans)
                    return ans;
                else
                    continue;
           }
           
           return arr[size-1]+1;

        
        // Your code here
        // You can add utility functions (if required)
        
    }
    
}


// { Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Missing obj = new Missing();
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}

  // } Driver Code Ends
