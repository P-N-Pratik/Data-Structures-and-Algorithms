class AlgoBubbleSort
{
    public void bubblesort(int arr[]){
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
    public void printarray(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }

}

class BubbleSort
{
    public static void main(String[] args)
     {
        
    
        int arr[]={9,8,7,6,5,4,3,2,1};
        AlgoBubbleSort abs=new AlgoBubbleSort();
        abs.printarray(arr);
        abs.bubblesort(arr);
        System.out.println();
        abs.printarray(arr);
    }

}