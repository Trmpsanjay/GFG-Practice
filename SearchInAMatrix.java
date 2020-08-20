/*package whatever //do not write package name here

link :  https://practice.geeksforgeeks.org/problems/search-in-a-matrix/0


*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
   
    public static int binarySearch(int arr[],int element,int si,int ei){
        if(si<=ei){
            int mid= (si+ei)/2;
            if(arr[mid]==element)
                return 1;
            else if(arr[mid]>element){
                return binarySearch(arr,element,si,mid-1);
            }
            else
                return binarySearch(arr,element,mid+1,ei);
        }
        return 0;
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-->0){
		    int numRow = sc.nextInt();
		    int numColumn = sc.nextInt();
		    int matrix[] = new int[numRow*numColumn];
		    for(int i=0;i<matrix.length;i++){
		        matrix[i] = sc.nextInt();
		    }
		    int searchElement = sc.nextInt();
		     //modified binary search
    // ie apply binary search in each row upto number of column element
            int isFound = 0;   // assume not present
            for(int i=0;i<matrix.length;i = i+numColumn ){
                     isFound = binarySearch(matrix,searchElement,i,i+numColumn-1);
    		        if(isFound==1){
		                break;
		            }
            }
		    
		        System.out.println(isFound);
		}
	}
}
