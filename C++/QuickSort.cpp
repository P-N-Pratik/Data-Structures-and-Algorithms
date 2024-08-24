#include<stdio.h>
void printarray(int arr[],int size){
	for(int i=0;i<size;i++){
		printf("%d",arr[i]);
	}
}
int partition(int arr[],int lb,int ub){
	
	int pivot=arr[lb];
	int start=lb;
	int end=ub;
	while(start<end){
		while(arr[start]<=pivot){
			start++;
		}
		while(arr[end]>pivot){
			end--;
			
		}
		if(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
	}
	int ptr=arr[lb];
	arr[lb]=arr[end];
	arr[end]=ptr;
	
	return end;
	
}
void quicksort(int arr[],int lb,int ub){
	
	
	if(lb<ub){
		int loc=partition(arr,lb,ub);
		quicksort(arr,lb,loc-1);
		quicksort(arr,loc+1,ub);
		
	}
}
int main(){
	int arr[]={9,8,7,6,5,4,3,2,1};
	int size=sizeof(arr)/sizeof(arr[0]);
	printarray(arr,size);
	printf("\nTHE SORTED ELEMENTS ARE :\n");
	quicksort(arr,0,size-1);
	printarray(arr,size);
	return 0;
	
}
