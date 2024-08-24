class N_QueenProblem1
{
    int v;
    int arr[][];
    String queens[];

    void helper(int v,int arr[][],String queens)
    {
        this.v=v;
        this.arr=arr;
        this.queens=queens;


    }

    // boolean attackChecker(int row)
    // {
    //     for (int j=0;j<v;j++)
    //     {
    //         if(row==0)
    //         {
    //             arr[row][j]=queens[row];
    //         }
    //         else if(arr[row-1][j-1]!=0 || arr[row-1][j+1]!=0)
    //         {
    //             continue;
    //         }
    //         else {
    //             for (int k=row-1;k>=0;k--)
    //             {
    //                 if(arr[k][j]!=0)
    //                 {
    //                     continue;
    //                 }
    //             }
    //         }

    //     }

    //     if (arr[row][j]==1)
        
    //         return false;
    //     }
    //     else if()
        

    // }



    boolean attackChecker(int row)
    {
        for (int j=0;j<v;j++)
        {
            
            
            
          

            
        }
    }
    public static void main(String[] args)
    {
        int v=4;
        //int q1=1,q2=2,q3=3,q4=4;

        int arr[][]=new int[v][v];
        String queens[]={"q1","q2","q3","q4"};
        helper(v,arr,queens);

        for (int i=0;i<v;i++)
        {
            // The Row has been Passed
            attackChecker(i);
        }
    }
}