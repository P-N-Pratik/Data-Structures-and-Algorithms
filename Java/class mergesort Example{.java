import java.util.*;
class mergesortExample{
    
    
    public static void merge(int arr[],int lb,int mid,int ub){
        
        int i=lb;
        int j=mid+1;
        int k=lb;
        int b[]=new int[100];
        
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
        for(int ptr=lb;ptr<=ub;ptr++){
            arr[ptr]=b[ptr];
            
        }
    }
    public static void mergesort(int arr[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={9,8,7,6,5,4,3,2,1};
        printarray(arr);
        System.out.println();
        mergesort(arr,0,arr.length-1);
        System.out.print("THE SORTED LIST IS :");
        printarray(arr);
    }
}