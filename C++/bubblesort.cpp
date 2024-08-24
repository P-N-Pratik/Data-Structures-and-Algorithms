#include<iostream>
using namespace std;
int bubblesort(int arr[],int size){
	for(int i=0;i<size-1;i++){
		for(int j=0;j<size-1-i;j++){
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			
		}
	}
	return -1;
}
int printarray(int arr[],int size){
	for(int i=0;i<size;i++){
		cout<<arr[i];
	}
}
int main(){
	int arr[]={9,8,7,6,5,4,3,2,1};
	int size=sizeof(arr)/sizeof(arr[0]);
	printarray(arr,size);
	bubblesort(arr,size);
	printarray(arr,size);
	return 0;
	
}
