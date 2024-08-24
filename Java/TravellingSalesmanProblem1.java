import java.util.Scanner;
class TravellingSalesmanProblem1
{
    
    

    public static void takeInput()
    {
        Scanner sc=new Scanner(System.in);
        int graph[][]=new int[4][4];
        System.out.println("Give Values :");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                int a=sc.nextInt();
                graph[i][j]=a;

            }
        }

        System.out.println(" ");

        System.out.println("The Graph is :");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(graph[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    

    public static void tSP(int node,int visit[],int graph[][],int cost,int count)
    {
        int next_node;
        visit[node]=1;
        // int cost=0;
        System.out.println("node-->");
        

        
        // int count=0;
        next_node=find_next_node(node,graph,visit);
        count++;

        

        // cost+=graph[node][next_node];
        if(count <= graph.length-1)
        {
            cost+=graph[node][next_node];
            System.out.println(cost);
            // visit[next_node]=1;
            tSP(next_node,visit,graph,cost,count);

        }
        else{
   


            int v=0;
            cost += graph[graph.length-1][v];
            System.out.println(""+cost);
            System.out.println("The Minimum Cost that the  vertex to reach itself visiting all the nodes only once is "+cost);
            return;
        }
        

        //System.out.println("The Minimum Cost ="+cost);
        
        
    }


    public static int find_next_node(int node,int graph[][],int visit[])
    {
        int nd=0;
        int min=65476;
        int demoCost=0;
        int min_index=0;
        for (int i=0;i<4;i++)
        {
            if(visit[i]!=1 && graph[node][i] != 0 && graph[node][i] < min)
            {
                // demoCost+=graph[node][i];
                min=graph[node][i];
                min_index=i;
            }
        }


        nd=min_index;
        //cost+=democost;
        return nd;


    }
    public static void main(String [] args)
    {
        int cost=0;
        int count=0;
        Scanner sc=new Scanner(System.in);
        int visited[]=new int [4];
        //takeInput();

        int graph[][]={
            {0,4,1,3},
            {4,0,2,1},
            {1,2,0,5},
            {3,1,5,0}
        };
        for (int i=0;i<4;i++)
        {
            visited[i]=0;
        }

        int start;
        System.out.println("Enter the Start Node :");
        start=sc.nextInt();
        tSP(start,visited,graph,cost,count);


        // System.out.println("The Minimum Cost that the "+start+" vertex to reach itself visiting all the nodes only once is "+cost);




    }
}



        


        



    







        
    
    