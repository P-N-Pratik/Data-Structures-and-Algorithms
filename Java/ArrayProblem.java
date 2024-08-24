
//User function Template for Java

class ArrayProblem {
    static int remove_duplicate(int A[],int N){
        // code here
        int k=0;
        for (int i=0;i<N;i++)
        {
            int flag=0;
            for (int j=i+1;j<N;j++)
            {
                if(A[i]!=A[j]  && A[j]>A[i])
                {
                    A[i+1]=A[j];
                    flag=1;
                    break;
                }
                
            }
            if (flag==0)
            {
                k=i;
                break;

            }
            k=i;
            
        }
        return k;

    
    
        
        
    }

    public static void main(String [] args)
    {
        int array[]={0,0,1,1,1,2,2,2,3};
        int n=array.length;
        // int k=remove_duplicate(array,n);
        // System.out.println(k);
        int k=remove_duplicate(array,n);
        // for (int i=0;i<n;i++)
        // {
        //     System.out.println(array[i]+"\t");
        // }

        System.out.println(k+1);

    }

}