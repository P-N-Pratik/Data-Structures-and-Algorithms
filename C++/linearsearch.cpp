#include<iostream>
using namespace std;
int linearsearch(int arr[],int size,int element){
	for(int i=0;i<=size-1;i++){
		if(arr[i]==element){
			return i;
		}
	}
	return -1;
	
}
int main(){
	int element;
	int arr[]={1,2,3,4,5,6,7,8,9};
	int size=sizeof(arr)/sizeof(arr[0]);
	cout<<"ENTER THE ELEMENT :";
	cin>>element;
	int result=linearsearch(arr,size,element);
	cout<<result;
	
	
	
	
}
