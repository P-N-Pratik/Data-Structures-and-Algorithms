#include<stdio.h>
int linearsearch(int arr[],int size,int element){
	for(int i=0;i<size;i++){
		if(arr[i]==element){
			return i;
		}
	
	}
	return -1;
}
int printarray(int arr[],int size){
	for(int i=0;i<size;i++){
		printf("%d",arr[i]);
	}
}
int main(){
	int element;
	int arr[]={1,2,3,4,5,6,7,8,9};
	int size=sizeof(arr)/sizeof(arr[0]);
	printf("%d\n",printarray(arr,size));
	printf("ENTER THE ELEMENT :");
	scanf("%d",&element);
	int result=linearsearch(arr,size,element);
	printf("THE INDEX OF THE ELEMENT IS %d",result);
	return 0;
	
}
