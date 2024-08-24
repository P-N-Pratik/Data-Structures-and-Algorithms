#include<stdio.h>
int printarray(int arr[],int size){
	for(int i=0;i<size;i++){
		printf("%d",arr[i]);
	}
}
void merge(int arr[],int lb,int mid,int ub){
	int i=lb;
	int j=mid+1;
	int k=lb;
	int b[100];
	while(i<=mid && j<=ub){
		if(arr[i]<arr[j]){
			b[k]=arr[i];
			i++;
			k++;
		}
		else{
			b[k]=arr[j];
			j++;
			k++;
			
		}
	}
	if(i>mid){
		while(j<=ub){
			b[k]=arr[j];
			j++;
			k++;
			
		}
	}
	else{
		while(i<=mid){
			b[k]=arr[i];
			i++;
			k++;
		}
	}
//	for(int i=0;i<=ub;i++){
//		arr[i]=b[i];
//	}
//	for (int i=0;i<=ub;i++)
//	{
//		
//	}
	
}
void mergesort(int arr[],int low,int high){
	int mid;
	if(low<high){
		mid=(low+high)/2;
		mergesort(arr,low,mid);
		mergesort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	
	
}
int main(){
	int arr[]={9,8,7,6,5,4,3,2,1};
	int size=sizeof(arr)/sizeof(arr[0]);
	printarray(arr,size);
	printf("\n");
	mergesort(arr,0,size-1);
	printarray(b,size);
	return 0;
	
	
}
