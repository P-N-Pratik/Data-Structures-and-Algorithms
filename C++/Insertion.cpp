#include<stdio.h>
int insertionsort(int arr[],int size){

for(int i=1;i<size;i++){
	int temp=arr[i];
	int j=i-1;
	while( j>=0 && arr[j]>temp){
		arr[j+1]=arr[j];
		j--;
	}
	arr[j+1]=temp;
}
}
int printarray(int arr[],int size){
	for(int i=0;i<size;i++){
		printf("%d",arr[i]);
	}
}
int main(){
	int arr[]={9,8,7,6,5,4,3,2,1};
	int size=sizeof(arr)/sizeof(arr[0]);
	printarray(arr,size);
	printf("\n");
	insertionsort(arr,size);
	printarray(arr,size);
	return 0;
	
}

