#include<stdio.h>
int selectionsort(int arr[],int size){
	for(int i=0;i<size-1;i++){
		int min=i;
		for(int j=i+1;j<size;j++){
			if(arr[j]<arr[min]){
				min=j;
			}
		}
		if(min!=i){
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	
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
	selectionsort(arr,size);
	printarray(arr,size);
	return 0;
	
	
}
