/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static void sortBinaryArray(int arr[]) 
	{ 
	    int i =0;
	    int j = arr.length-1;
	    while(i<j){
	        if(arr[i]!=0 && arr[j]!=1){
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	            j--;
	        }
	        else if(arr[j]==1){
	            j--;
	        }
	        else{
	          i++;
	        }
	    }
	} 
	public static void main (String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	    //taking input of no of testcases
	    int testCases = sc.nextInt();
	    while(testCases-->0){
	        // taking input size of the the array
	        int size = sc.nextInt();
	        int arr[] = new int[size];
	        for(int i=0;i<size;i++){
	            arr[i] = sc.nextInt();
	            
	        }
	        sortBinaryArray(arr);
	        for(int i=0;i<size;i++){
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	        
	    }
	}
}
