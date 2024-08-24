import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;

class AllPairShortestPath
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        final int INF = 99999;
        System.out.println("Provide the Graph as an Input");
        // System.out.println("Enter the Number of Rows");
        // int rows=sc.nextInt();
        // System.out.println("Enter the Number of Columns");
        // int col=sc.nextInt();

        // System.out.println("Enter the Number of Verties ");
        // int vertices=sc.nextInt();

        // int matrix[][]=new int[vertices][vertices];
        int matrix[][]={
            {0,5,INF,10},
            {INF,0,3,INF},
            {INF,INF,0,1},
            {INF,INF,INF,0}



        };


        // for(int i=0;i<vertices;i++)
        // {
        //     for (int j=0;j<vertices;j++)
        //     {
        //         System.out.println("Enter the value for arr["+i+"]["+j+"]");
        //         int value= sc.nextLine();
        //         matrix[i][j]=value;

        //     }
        // }

        for(int q=0;q<matrix.length;q++)
        {
            for (int w=0;w<matrix.length;w++)
            {
                for(int e=0;e<matrix.length;e++)
                {
                    if(matrix[w][e]>matrix[w][q]+matrix[q][e])
                    {
                        matrix[w][e]=matrix[w][q]+matrix[q][e];
                    }

                }
            }
        }


        System.out.println("The AllPairShortestPath Matrix is as Follows :");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[i][j]==INF)
                {
                    System.out.print("INF"+"\t");
                }
                else
                {
                    System.out.print(matrix[i][j]+"\t");

                }
                

            }
            System.out.println(" ");
        }












    }
}