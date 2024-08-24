import java.util.Scanner;

class BellmanFord
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        final int INF = 99999; 


        // System.out.println("Enter the Number of Vertices ");
        // int vertices=sc.nextInt();

        // int matrix[][]=new int[vertices+1][vertices+1];
        // int cost[]=new int[vertices+1];


        // The Logic to Enter the Matrix Values as the Input from the User.
        // for (int k=0;k<vertices+1;k++)
        // {
        //     for (int j=0;j<vertices+1;j++)
        //     {


        //         System.out.println("Enter the value for arr["+k+"]["+j+"]");
        //         int value= sc.nextInt();
        //         matrix[k][j]=value;


        //     }


        // }


        // The Static Matrix

        // Example 1

        // int matrix[][]={
        //     {0,0,0,0,0,0,0,0},
        //     {0,0,6,5,5,0,0,0},
        //     {0,0,0,0,0,-1,0,0},
        //     {0,0,-2,0,0,3,0,0},
        //     {0,0,0,-2,0,0,-1,0},
        //     {0,0,0,0,0,0,0,3},
        //     {0,0,0,0,0,0,0,3},
        //     {0,0,0,0,0,0,0,0}





        // };

        // Example 2

        int matrix[][]={
            {0,0,0,0,0},
            {0,0,4,0,5},
            {0,0,0,0,0},
            {0,0,-10,0,0},
            {0,0,0,3,0}



        };

        int cost[]=new int[matrix.length];

        System.out.println("Intitialized Cost Matrix as Infinite as the cost of all the vertices are initially considered to be infinite except the 1st vertex ,and the 1st vertexis intially considered to be 0 ");
        for (int i=0;i<matrix.length;i++)
        {
            cost[i]=INF;
        }
        cost[1]=0;




        System.out.println("");
        System.out.println("The Matrix That you have Entered is :");
        for (int q=0;q<matrix.length;q++)
        {
            for (int w=0;w<matrix.length;w++)
            {
                System.out.print(matrix[q][w]+"\t");





            }
            System.out.println(" ");


        }


        

        System.out.println("");
    // The Bellman Ford's Logic    
        for (int a=0;a<matrix.length;a++)

        {
            for (int i=0;i<matrix.length;i++)
            {
                for (int j=0;j<matrix.length;j++)
                {
                    if (matrix[i][j]!=0)
                    {
                        if(cost[i]+matrix[i][j]<cost[j])
                        {
                            cost[j]=cost[i]+matrix[i][j];
                        }
                    }
                }
            }

        }

        System.out.println("");
        System.out.println("The Matrix After the Logic has Worked successfully :");
        for (int q=0;q<matrix.length;q++)
        {
            for (int w=0;w<matrix.length;w++)
            {
                System.out.print(matrix[q][w]+"\t");





            }
            System.out.println(" ");


        }


        System.out.println("Finally the Cost of the Vertices are :");
        for (int r=0;r<matrix.length;r++)
        {
            System.out.print(cost[r]+"\t");
        }









    }
}