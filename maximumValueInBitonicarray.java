// { Driver Code Starts
//Initial Template for Java


// link : https://practice.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1/?category[]=Arrays&problemStatus=unsolved&difficulty[]=0&difficulty[]=1&page=1&query=category[]ArraysproblemStatusunsolveddifficulty[]0difficulty[]1page1


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int findMaximum(int[] arr, int n) {
       int low = 0;
       int high = arr.length-1;
       while(low<=high){
           int mid = (low+high)/2;
           if(mid <= arr.length-2 && mid>=1 &&arr[mid+1]<arr[mid] && arr[mid-1]<arr[mid]){
               return arr[mid];
           }
           else if(mid <= arr.length-2 && arr[mid]<=arr[mid+1]){
               low = mid+1;
           }
           else
                high = mid-1;
            
       }
       if(arr.length-1>arr[0])
            return arr[arr.length-1];
        else
            return arr[0];
    }
}
