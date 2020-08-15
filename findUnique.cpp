#include <iostream>
using namespace std;

 int findUnique(int arr[],int n){
        // 1. XOR of a number with itself is 0.
        // 2. XOR of a number with 0 is number itself.
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = ans ^ arr[i];
        }
        return ans;
    };
int main() {
	int testCases ;
	cin>>testCases;
	while(testCases-->0){
	    int n;
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++){
	        cin>>arr[i];
	    }
	    cout<<findUnique(arr,n)<<endl;
	}
	return 0;
}
