#include<iostream>
using namespace std;
int binarysearch(int arr[],int size,int element){
	int low=0;
	int high=size-1;
	while(low<=high){
		int mid=(low+high)/2,i;
		if(arr[mid]==element){
			return mid;
		}
		else if(arr[mid]<element){
			low=mid+1;
			
		}
		else{
			high=mid-1;
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
	int arr[]={1,2,3,4,5,6,7,8,9};
	int size=sizeof(arr)/sizeof(arr[0]);
	int element;
	printarray(arr,size);
	cout<<"Enter the element :";
	cin>>element;
	int result=binarysearch(arr,size,element);
	cout<<"THE INDEX OF THE ELEMENT IS :"<<result;
	return 0;
}
