class OptimalBinarySearchTree
{
    public static void main(String [] args)
    {
        int key[]={10,20,30};
        int frequency[]={3,2,5};
        int cost[][]=new int[key.length+1][key.length+1];
        int weight[][]=new int[key.length+1][key.length+1];

        for(int d=1;d<=key.length;d++)
        {
            for (int i=0;i<key.length+1-d;i++)
            {
                int j=i+d;
                if (d==1)
                {
                    weight[i][j]=frequency[j-1];
                }
                else
                {
                    for(int k=i+1;k<=j;k++)
                    {
                        weight[i][j]+=frequency[k-1];

                    }
                    
                }
            }
        }


        System.out.println("Weight Matrix :");
        for (int i=0;i<key.length+1;i++)
        {
            for (int j=0;j<key.length+1;j++)
            {
                System.out.print(weight[i][j]+"\t");
            }
            System.out.println("");
        }



        for(int d=1;d<=key.length;d++)
        {
            for (int i=0;i<key.length+1-d;i++)
            {
                int j=i+d;
                if (d==1)
                {
                    cost[i][j]=frequency[j-1];
                }
                else
                {
                    int minimum=465676;
                    for(int k=i+1;k<=j;k++)
                    {
                        if((cost[i][k-1]+cost[k][j])+weight[i][j]<minimum)
                        {
                            minimum=(cost[i][k-1]+cost[k][j])+weight[i][j];
                            cost[i][j]=(cost[i][k-1]+cost[k][j])+weight[i][j];

                        }
                        

                    }
                    
                }
            }
        }



        System.out.println("Cost Matrix :");
        for (int i=0;i<key.length+1;i++)
        {
            for (int j=0;j<key.length+1;j++)
            {
                System.out.print(cost[i][j]+"\t");
            }
            System.out.println("");
        }

        System.out.println("The Optimal Minimum cost of a Binary Search Tree is "+ cost[0][key.length]);







    }
}