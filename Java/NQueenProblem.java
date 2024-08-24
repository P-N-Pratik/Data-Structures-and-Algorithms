import java.io.InputStreamReader;
import java.util.Scanner;
class NQueenProblem
{
    boolean isSafe(int arr[][],int x,int y,int n)
    {
        for (int row=0;row<x;row++)
        {
            if (arr[row][y]==1)
            {
                return false;
            }
        }

        int row=x;
        int col=y;
        while(row>=0 && col>=0)
        {
            if(arr[row][col]==1)
            {
                return false;
            }
            row--;
            col--;

        }

        row=x;
        col=y;
        while(row>=0 && col<n)
        {
            if(arr[row][col]==1)
            {
                return false;
            }
            row--;
            col++;

        }
        return true;


    }

    boolean nQueen(int arr[][],int row ,int n)
    {
        if(row>=n)
        {
            return true;
        }

        for (int col=0;col<n;col++)
        {
            if(isSafe(arr,row,col,n))
            {
                arr[row][col]=1;

                if(nQueen(arr,row+1,n))
                {
                    return true;

                }
                else{
                    arr[row][col]=0;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimension type of the CHESS BOARD :");
        int v=sc.nextInt();

        NQueenProblem nq=new NQueenProblem();
        int chessBoard[][]=new int[v][v];
        if(nq.nQueen(chessBoard,0,v))
        {
            System.out.println("The One of the Feasible Solution is :");
            for (int i=0;i<v;i++){
                for (int j=0;j<v;j++)
                {
                    System.out.print(chessBoard[i][j]+"\t");
                }
                System.out.println("");
            }
        
        }
        else{
            System.out.println("No Solution ");
        }
        InputStreamReader ir;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        
    }
}

// Final Solution .
