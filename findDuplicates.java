// link : https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1/?problemStatus=unsolved&problemType=functional&difficulty[]=0&difficulty[]=1&page=1&sortBy=submissions&query=problemStatusunsolvedproblemTypefunctionaldifficulty[]0difficulty[]1page1sortBysubmissions#



// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends




// Traverse the array from start to end.
// For every element,take its absolute value and if the abs(array[i])‘th element is positive, the element has not encountered before, else if negative the element has been encountered before print the absolute value of the current element.


// Solution {
//     public static ArrayList<Integer> duplicates(int arr[], int n) {
//         HashSet<Integer> set = new HashSet<>();
//         ArrayList<Integer> ans = new ArrayList<>();
//         for(int x : arr){
//             if(set.contains(x)){
//                 if(!ans.contains(x))
//                     ans.add(x);
//             }
//             else
//                 set.add(x);
//         }
//         if(ans.size()==0){
//             ans.add(-1);
//         }
//         Collections.sort(ans);
//         return ans;
//     }
// }


//Above solution giving tle;

// need to solve in o(n)


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
       
        ArrayList<Integer> ans = new ArrayList<>();
        int map[] = new int[n];
        for(int i=0;i<n;i++){
            int temp = arr[i];
            if(map[temp]==0){
                map[temp]= 1;
            }
            else if(map[temp]==1){
                ans.add(temp);
                map[temp]++;
            }
        }
        if(ans.size()==0)
            ans.add(-1);
            Collections.sort(ans);
        return ans;
    }
}



// need to understand this method


// void printDuplicates(int a[], int n) {
//     // add code here.
//     int c=1;
//     for(int i=0; i<n; ++i){
//         int ind = a[i] % n;
//         a[ind] += n;
//     }
    
//     for(int i=0; i<n; ++i){
//         if(a[i]/n > 1){
//             cout<<i<<" ";
//             c =0;
//         }
//     }
    
//     if(c) cout<<"-1";
// }
