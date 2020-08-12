/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    //taking input of no of testcases
	    int testCases = sc.nextInt();
	    while(testCases-->0){
	        // taking input size of the the array
	        int size = sc.nextInt();
	        int arr[] = new int[size];
	        //creating priority min queue for storing the array element
	        PriorityQueue<Integer> pq = new PriorityQueue<>();
	        for(int i=0;i<size;i++){
	            arr[i] = sc.nextInt();
	            pq.add(arr[i]);
	            
	        }
	        //taking input k
	        int k = sc.nextInt();
	        int ans = 0;
	        //remove k times  and print kth element
	        for(int i=0;i<k;i++){
	            ans = pq.remove();
	        }
	        System.out.println(ans);
	    }
	
	}
}
