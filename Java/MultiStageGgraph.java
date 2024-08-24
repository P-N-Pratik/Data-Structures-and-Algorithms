class MultiStageGgraph
{
    
    
    // public static int min(int a)
    // {
    //     int minimumCost=345676;
    //     if(a<minimumCost)
    //     {
            
    //         minimumCost=a;
    //         distance[vertex]=k;
            
    //     }
    //     return a;
    // }
    public static void main(String [] args)
    {
        int graph[][]={
            {0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,9,7,3,2,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,4,2,1,0,0,0,0},
            {0,0,0,0,0,0,2,7,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,11,0,0,0,0},
            {0,0,0,0,0,0,0,11,8,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,6,5,0,0},
            {0,0,0,0,0,0,0,0,0,4,3,0,0},
            {0,0,0,0,0,0,0,0,0,0,5,6,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,4},
            {0,0,0,0,0,0,0,0,0,0,0,0,2},
            {0,0,0,0,0,0,0,0,0,0,0,0,5},
            {0,0,0,0,0,0,0,0,0,0,0,0,0}
            
  





        };
        int stageMatrix[][]={{0,1},{2,3,4,5},{6,7,8},{9,10,11},{12}};
        int vertices=13;
        int cost[]=new int[vertices];
        int distance[]=new int[vertices];
        cost[12]=0;
        // cost[stageMatrix[length(stagematrix)][length(length(staageMatrix))]]=0;
        // int min_Cost=345676;
        for(int i=stageMatrix.length-1;i>=0;i--)
        {
            int min_Cost=345676;
            for (int j=0;j<=stageMatrix[i].length-1;j++)
            {
                int vertex=stageMatrix[i][j];
                int minimum_Cost=345676;
                for(int k=vertex+1;k<vertices;k++)
                {
                    if(graph[vertex][k]!=0 && graph[vertex][k]+cost[k]<minimum_Cost)
                    {
                        minimum_Cost=graph[vertex][k]+cost[k];
                        cost[vertex]=graph[vertex][k]+cost[k];
                        distance[vertex]=k;
                        
                    }
                }
                if(minimum_Cost<min_Cost)
                {
                    min_Cost=minimum_Cost;
                    int vertexThatHasMinimumCost=vertex;
                    
                }

            }

        }

        System.out.println("Cost Array :");
        for(int i=0;i<vertices;i++)
        {
            System.out.print(i+"\t");
        }
        System.out.println(" ");
        for(int i=0;i<vertices;i++)
        {
            System.out.print(cost[i]+"\t");

        }

        System.out.println(" ");

        System.out.println("Distance Array :");
        for(int i=0;i<vertices;i++)
        {
            System.out.print(i+"\t");
        }
        System.out.println(" ");
        for (int j=0;j<vertices;j++)
        {
            System.out.print(distance[j]+"\t");
        }

        // System.out.println("The Vertex that has the Minimum Cost");


    }
}

// MultiStageGgraph Done