/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int findNum(int arr[], int num,int size){
        if(size==0){
            return -1;
        }
        for(int i=0;i<size;i++){
            if(arr[i]==num){
                return i+1;
            }
        }
        return -1;
    }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int testCases = sc.nextInt(); 
        while(testCases-->0){
            int size = sc.nextInt();
            int num = sc.nextInt();
            int arr[] = new int[size];
            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }
        System.out.println(findNum(arr,num,size));
        
        }
	}
}
