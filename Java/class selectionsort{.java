class selectionsort{
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
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
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={9,8,7,6,5,4,3,2,1};
        printarray(arr);
        selectionsort(arr);
        System.out.println("TH SORTED LIST IS :");
        printarray(arr);
        

    }

}