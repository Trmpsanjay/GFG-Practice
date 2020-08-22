#include <iostream>
using namespace std;


 void rotate(int arr[], int d , int size) {
        int temp[size];
        for(int i=0;i<size;i++)
            temp[i]=arr[i];
        for(int i=0;i<size;i++)
        {
            if(i-d>=0)
            arr[i-d]=temp[i];
            else
            arr[size+(i-d)]=temp[i];
        }
    }

int main() {
	int testCases;
	cin>>testCases;
		while(testCases-->0){
		    //taking size of array and creating array
		    int size,rotateIndex;
		    cin>>size>>rotateIndex;
		    int arr[size];
		    //taking input of arrays
		    for(int i=0;i<size;i++){
		        cin>>arr[i];
		    }
		    rotate(arr,rotateIndex,size);
		    for(int i=0;i<size;i++){
		       cout<<arr[i]<<" ";
		    }
		    cout<<"\n"; // don't use endl it is slower
		}
	return 0;
}
