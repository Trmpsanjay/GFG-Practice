/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;


// Best Metod 2 o(logn) binary sear
class GFG {
    public static int countZeroes(int arr[],int si,int li){
        //base case
        int mid = (si+li)/2;
        if(li<=si){
            return mid;
        }
        // check if length 0 then return zero or mid element 0 and mid-1 = 1 so return mid because no more zero is will
        //be there because firstly in array there will be 1 and followed by zero
        if((mid==0 || arr[mid-1]==1) && arr[mid]==0)
            return mid;
            // otherwise mid = 0 and mid-1 = 0 that means more zero are present so make ei as mid-1 and 
            //call recursive function for result;
        else if (arr[mid]==0 && arr[mid-1]==0)
            return countZeroes(arr,si,mid-1);
            // in other case make lower bound as mid+1
        else
            return countZeroes(arr,mid+1,li);
    }
	public static void main (String[] args) {
		//taking input test case
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-->0){
		    // taking input size of array and array elements
		    int size = sc.nextInt();
		    int arr[] = new int[size];
		    for(int i=0;i<size;i++){
		        arr[i] = sc.nextInt();
		    }
		    System.out.println(size-countZeroes(arr,0,size-1));
		}
		
	}
}
/*****
////// method 1 easy
class GFG {
	public static void main (String[] args) {
		//taking input test case
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-->0){
		    // taking input size of array and array elements
		    int size = sc.nextInt();
		    //initializing sum for kepp track of zero
		    int sum =0;
		    int arr[] = new int[size];
		    for(int i=0;i<size;i++){
		        arr[i] = sc.nextInt();
		        sum = sum + arr[i];
		    }
		    System.out.println(size-sum);
		}
		
	}
}
*///
