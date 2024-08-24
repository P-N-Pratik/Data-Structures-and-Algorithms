class DepthFirstSearch
{

    int v;
    int adj[][]=new int[v][v];
    public void helper(int graph[][],int v)
    {
        this.v=v;
        this.adj=graph;
    }

    public void dFS(int start,boolean visited[])
    {
        System.out.println(start);
        visited[start]=true;
        for (int i=0;i<adj[\
        ].length;i++)
        {
            if(adj[start][i]==1 && !visited[i])
            {
                dFS(i,visited);

            }
        }


    }
    public static void main(String [] args )
    {
        DepthFirstSearch dp=new DepthFirstSearch();

        int graph[][]={
            {0,0,0,0,0,0,0,0,0},
            {0,0,1,1,0,0,0,0,0},
            {0,0,0,0,1,1,0,0,0},
            {0,0,0,0,0,0,1,1,0},
            {0,0,1,0,0,0,0,0,1},
            {0,0,1,0,0,0,0,0,1},
            {0,0,0,1,0,0,0,1,1},
            {0,0,0,1,0,0,1,0,1},
            {0,0,0,0,1,1,1,1,0}
        };
        int v=graph.length;
        System.out.println(v);

        boolean visited[]=new boolean[v];
        System.out.println(visited.length);

        dp.helper(graph,v);
        dp.dFS(1,visited);
    }

}