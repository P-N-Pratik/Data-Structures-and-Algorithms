import java.util.Scanner;
class BreadthFirstSearch
{
    static int v;
    int front=-1,rear=-1;
    int adj[][];

    public static void initializer(boolean visited[])
    {
        for (int i=0;i<v;i++)
        {
            visited[i]=false;

        }
    }

    void helper(int v,int adj[][])
    {
        this.v=v;
        this.adj=adj;
    }

    void bFS(int start)
    {
        boolean visited[]=new boolean[v];
        initializer(visited);
        int queue[]=new int[v];
        if(front==-1 && rear==-1)
        {
            
            rear++;
            queue[rear]=start;
            
            visited[start]=true;
        }

        
        
        
        
        int count=0;
        while(front!=rear)
        {
            front++;
            int vis=queue[front];
            System.out.println(vis);
            for (int i=0;i<v;i++)
            {
                if(adj[vis][i]==1 && !visited[i])///
                {
                    rear++;
                    queue[rear]=i;
                    visited[i]=true;
                }



            }
            count++;

            

        }
        //i ubyt vystem.out.println(count);





    }
    public static void main(String [] args)
    {
        BreadthFirstSearch bfs=new BreadthFirstSearch();

       Scanner sc=new Scanner(System.in); 
        // int graph[][]={
        //     {0,0,0,0,0,0,0,0,0},
        //     {0,0,1,1,0,0,0,0,0},
        //     {0,0,0,0,1,1,0,0,0},
        //     {0,0,0,0,0,0,1,1,0},
        //     {0,0,1,0,0,0,0,0,1},
        //     {0,0,1,0,0,0,0,0,1},
        //     {0,0,0,1,0,0,0,1,1},
        //     {0,0,0,1,0,0,1,0,1},
        //     {0,0,0,0,1,1,1,1,0}
        // };

        int graph[][]=
        {
            {0,1,1,0},
            {1,0,0,1},
            {1,0,0,0},
            {0,1,0,0}
        };
        System.out.println("Enter the Starting vertex :");
        int sv=sc.nextInt();

        int vertices=graph.length;
        bfs.helper(vertices,graph);
        bfs.bFS(sv);
    }
}