/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
     public static void rotate(int[] arr, int d) {
        int[] temp= new int[arr.length];
        for(int i=0;i<arr.length;i++)
            temp[i]=arr[i];
        for(int i=0;i<arr.length;i++)
        {
            if(i-d>=0)
            arr[i-d]=temp[i];
            else
            arr[arr.length+(i-d)]=temp[i];
        }
    }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-->0){
		    //taking size of array and creating array
		    int size = sc.nextInt();
		    int rotateIndex = sc.nextInt();
		    int arr[] = new int[size];
		    //taking input of arrays
		    for(int i=0;i<size;i++){
		        arr[i] = sc.nextInt();
		    }
		    rotate(arr,rotateIndex);
		    for(int i=0;i<size;i++){
		        System.out.print(arr[i]+" ");
		    }
		    System.out.println();
		}
	}
}
