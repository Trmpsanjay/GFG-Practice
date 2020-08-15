#include <iostream>
using namespace std;

int findNum(int arr[], int num,int size){
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
        cout<<findNum(arr,num,size)<<endl;
        
    }
	//code
	return 0;
}
