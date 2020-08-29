#include <iostream>
using namespace std;


int findUniqueOccuranceElement(int arr[],int size){
    int ans =0;
    for(int i = 0 ; i< size ; i++){
        ans = ans ^ arr[i];
    }
    return ans;
}
int main() {
	int testCases;
	cin>>testCases;
	while(testCases-->0){
	    int size ;
	    cin>>size;
	    int arr[size];
	    for(int i=0;i<size;i++){
	        cin>>arr[i];
	    }
	    cout<<findUniqueOccuranceElement(arr,size)<<"\n";
	}
	return 0;
}
