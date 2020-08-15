/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int findUnique(int arr[]){
        // 1. XOR of a number with itself is 0.
        // 2. XOR of a number with 0 is number itself.
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-->0){
		    // taking input size of array and array elements
		    int size = sc.nextInt();
		    int arr[] = new int[size];
		    for(int i=0;i<size;i++){
		        arr[i] = sc.nextInt();
		    }
		    System.out.println(findUnique(arr));
		}
	}
}
