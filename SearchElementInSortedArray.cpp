#include <iostream>
using namespace std;


int binarySearch(int arr[],int element,int si,int ei){
    if(si>ei){
        return-1;
    }
    int mid = (si+ei)/2;
    if(arr[mid]==element){
        return 1;
    }
    if(arr[mid]<element)
        return binarySearch(arr,element,mid+1,ei);
    else
        return binarySearch(arr,element,si,mid-1);
}

int main() {
	    int testCases ;
        cin>>testCases;
        while(testCases-->0){
            int size;
            cin>>size;
            int num;
            cin>>num;
            int arr[size];
            for(int i=0;i<size;i++){
                cin>>arr[i];
            }
            cout<<binarySearch(arr,num,0,size-1)<<endl;
        
    }
	return 0;
}
