java.util.Scanner;
class MultiStageGraph
{
    // public static void main(String [] args)
    // {
    //     Int verticesinStagesArray[][]=new Int();
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the Number of Stages :");
    //     int stages=sc.nextInt();
    //     System.out.println("Enter the Stage Number in which you want to Enter the vertices ");
    //     int stage_no=sc.nextInt();
    //     System.out.println("Enter the Number of Vertices you want Enter ");
    //     int vertices=sc.nextInt();
        
    //     for (int i=stage_no;i<verticesinStageArray[stage_no].length();i++)
    //     {

    //     } 

    //     int Graph[][]={{}}

    // }
    
    public static void main(String [] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Stages :");
        int stages=sc.nextInt();
        for(int i=0;i<stages;i++)
        {
            System.out.println("Enter the Number of vertices you want to Enter into the stage "+ i);
            int vertices=sc.nextInt();
            int verticesinStagesArray[][]=new int[stages][vertices];
            for (int j=0;j<vertices;j++)
            {
                System.out.println("Enter the vertex :");
                int vertex=sc.nextInt();
                verticesinStagesArray[i][j]=vertex;



            }

            

            
        }

        
    }
}