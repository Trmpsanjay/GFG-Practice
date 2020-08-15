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
