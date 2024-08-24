class quicksort
{
    public static int  partition(int arr[],int i,int j){
       
        int pivot=arr[i];
        int start=i;
        int end=j;
        while(start<end){
            while(arr[start]<pivot){
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
        


        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;

        return end;
    

    }
    public static void quicksort(int arr[],int i,int j){
        if(i<j){
        int loc=partition(arr,i,j);
        quicksort(arr,i,loc-1);
        quicksort(arr,loc+1,j);
        }

    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={9,8,7,6,5,4,3,2,1};
        printarray(arr);
        System.out.println();
        quicksort(arr,0,arr.length-1);
        System.out.println("THE SORTED LIST IS :");

        printarray(arr);

    }
   
}