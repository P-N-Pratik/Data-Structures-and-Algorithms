class bubblesortExample{
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
        
        bubblesort(arr);
        System.out.println("THE SORTED LIST IS :");
        printarray(arr);
    }
}