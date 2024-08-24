class insertionsort{
    public static void insertionsort(int arr[]){
       for(int i=1;i<arr.length;i++){
        int temp=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
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
        insertionsort(arr);
        System.out.println("THE SORTED LIST IS :");
        printarray(arr);
        

    }
}