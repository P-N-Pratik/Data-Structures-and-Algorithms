import java.util.Scanner;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;




class MatrixChainMultiplication
{

    public static void main(String [] args)
    {


        // To take the Matrices as the Input from the user for the Muliplication.


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Matrices you wanna give as an input for Multiplication");
        int matrices=sc.nextInt();
       
        int ArrayOfAllMatrices[][][]=new int[matrices+1][100][100];
        int rowArray[]=new int[100];
        int colArray[]=new int[100];
        int mi[][]=new int[matrices+1][matrices+1];
        int s[][]=new int[matrices+1][matrices+1];


        





        
       // { { {},{},{} } , { {},{},{} } , { {},{},{} } ,{ {},{},{} } }
        for (int i=1;i<=matrices;i++)
        {
            
            
            System.out.println("Enter the number of rows and columns for the Matrix no :"+ i);
            System.out.println("Enter the Number of Rows");
            int rows=sc.nextInt();
            System.out.println("Enter the Number of Columns");
            int col=sc.nextInt();


            if(i==1 || colArray[i-1]==rows)
            {

                rowArray[i]=rows;
                colArray[i]=col;









                // System.out.println("Enter the name of the Matrix Number "+i);
                // String matrixName=sc.nextLine();


            
                //System.out.println("An Array Created for the Matrix number "+i);


           
           
                // int[][] matrix=new int[rows][col];
                // System.out.println("An Array created for the Matrix "+i);
            

                                                                                                
                for (int k=0;k<rows;k++)
                {
                    for (int j=0;j<col;j++)
                    {


                        System.out.println("Enter the value for arr["+k+"]["+j+"]");
                        int value= sc.nextInt();
                        ArrayOfAllMatrices[i][k][j]=value;


                    }


                }

                System.out.println("The values in the Matrix "+i+ " are");
                for(int l=0;l<rows;l++)
                {
                    for(int m=0;m<col;m++)
                    {
                        System.out.print(ArrayOfAllMatrices[i][l][m]+"\t");
                    }
                    System.out.println("");
                }
            }



        
            else
            {
                System.out.println("The dimensions that you provided are incorrect ");
                System.out.println("The Correct Way is, That The Rows of the Current Matrix Must be equal to the Columns of the previous Matrix,As it is an Important Property for the Multiplication of Two Matrices. ");
                System.out.println("Please Renter the Dimensions in the correct Manner ");
            }
        }
        
        
        System.out.println("Hello World");
        System.out.println("The Matrices that the User has Entered are :");
        System.out.println(ArrayOfAllMatrices.length);

        for(int k=0;k<ArrayOfAllMatrices.length;k++)
        {
            System.out.println("The Elements in the Matrix "+k+" are as Follows :");
            for (int o=0;o<rowArray[k];o++)
            {
                for (int j=0;j<colArray[k];j++)
                {
                    System.out.print(ArrayOfAllMatrices[k][o][j]+"\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }

        int OneTwo=rowArray[1]*colArray[1]*colArray[2];
        System.out.println(OneTwo);



        // System.out.println(ArrayOfAllMatrices.length);
        // System.out.println(ArrayOfAllMatrices[0].length);
        // System.out.println(ArrayOfAllMatrices[0][0].length);
        // //printArray(ArrayOfAllMatrices);

        // System.out.println(ArrayOfAllMatrices[0][0][0]+"\t"+ArrayOfAllMatrices[0][0][1]);
        // System.out.println(ArrayOfAllMatrices[0][1][0]+"\t"+ArrayOfAllMatrices[0][1][1]);
        // System.out.println(ArrayOfAllMatrices[0][2][0]+"\t"+ArrayOfAllMatrices[0][2][1]);


        // _____________________________________________________________________________________________________________________________

        for (int d=1;d<=matrices-1;d++)
        {
            for (int i=1;i<=matrices-d;i++)
            {
                int j=i+d;
                int min=656478;

                

                for (int k=i;k<=j-1;k++)
                {
                    // m[i][j]=min(m[i][k]+m[k+1][j]+rowArray[i]*colArray[k]*colArray[j]);
                    if(mi[i][k]+mi[k+1][j]+rowArray[i]*colArray[k]*colArray[j]<min)
                    {
                        min=mi[i][k]+mi[k+1][j]+rowArray[i]*colArray[k]*colArray[j];
                        System.out.println(min);
                        mi[i][j]=mi[i][k]+mi[k+1][j]+(rowArray[i]*colArray[k]*colArray[j]);
                        s[i][j]=k;
                    }

                }
            }
        }



        System.out.println("The Row Array");
        for(int e=0;e<matrices+1;e++)
        {
            System.out.print(rowArray[e]+"\t");
        }

        System.out.println(" ");

        System.out.println("The Column Array");
        for (int r=0;r<matrices+1;r++)
        {
            System.out.print(colArray[r]+"\t");
        }

        System.out.println(" ");


        System.out.println("The Mi matrrix ");
        for(int q=0;q<=matrices;q++)
        {
            for(int w=0;w<=matrices;w++)
            {
                System.out.print(mi[q][w]+"\t");
            }
            System.out.println("");
        }
        System.out.println("The S Matrix");
        for(int q=0;q<=matrices;q++)
        {
            for(int w=0;w<=matrices;w++)
            {
                System.out.print(s[q][w]+"\t");
            }
            System.out.println("");
        }
            





        




    }
}
 



    









    





