#include <iostream>
using namespace std;
void sortBinaryArray(int arr[],int n) { 
	    int i =0;
	    int j = n-1;
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
	};

int main() {
	int t;
	cin>>t;
	while(t-->0){
	    int n;
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++){
	        cin>>arr[i];
	    }
	    sortBinaryArray(arr,n);
	    for(int i=0;i<n;i++){
	        cout<<arr[i]<<" ";
	    }
	    cout<<endl;
	}
	return 0;
}
