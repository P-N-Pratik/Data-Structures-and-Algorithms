#include<stdio.h>
void bubblesort(int arr[],int size){
	for(int  i=0;i<=size-1;i++){
		for(int j=0;j<size-1-i;j++){
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
	}
}
int printarray(int arr[],int size){
	for(int i=0;i<size;i++){
		printf("%d ",arr[i]);
	}
	
}
int main(){
	int arr[]={-7,-1,3,-9,-4,7,-3,2,4,9,4,-9,8,-7,5,-1,-7};
	int size=sizeof(arr)/sizeof(arr[0]);
	printarray(arr,size);
	printf("\n");
	bubblesort(arr,size);
	printf("THE ELEMENTS ARE SORTED IN THE ASCENDING ORDER :");
	printarray(arr,size);
	return 0;
}
