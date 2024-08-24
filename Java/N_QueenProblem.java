class N_QueenProblem
{
    public static void main(String [] args)
    {
        int v=4;
        int q1=1,q2=2,q3=3,q4=4;

        int arr[][]=new int[v][v];
        String queens[]={"q1","q2","q3","q4"};
        
        
        for (int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                if(arr)
                for (int k=i-1;k>=0;k--)
                {
                    if(arr[k][i]!=0)
                    {
                        break;
                    }
                    // else if(arr[i-1][j-1]!=0 || arr[i-1][j+1]!=0)
                    // {
                    //     break;
                    // }
                }
                if (arr[i-1][j-1]!=0 || arr[i-1][j+1]!=0)
                {
                    continue;

                }
                else
                {
                    arr[i][j]=Integer.parseInt(queens[i]);

                }
                
                // for (int u=i+1;u<v;u++)
                // {
                //     if(arr[u][i]!=0)
                //     {
                //         j++;
                //     }
                // }

                // if(arr[i-1][j-1]!=0 || arr[i-1][j+1]!=0)
                // {
                //     j++;
                // }

            }
        }

    }
}