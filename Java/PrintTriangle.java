import java.util.Scanner;

class PrintTriangle
{

    public static void printTriangle(int n)
    {
        int a=n;
        
        for (int i=0;i<a;i++)
        {
            
            for (int j=0;j<(a-i);j++)
            {
                System.out.print("*");
            }
            
            for (int k=0;k<(2*i);k++)
            {
                System.out.print(" ");
            }
            
            for (int w=0;w<(a-i);w++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }

        for (int i=(a-1);i>=0;i--)
        {

            for (int k=(a-1);k>=i;k--)
            {
                System.out.print("*");
            }

            
            for (int j=0;j<(2*i);j++)
            {
                System.out.print(" ");
            }

            for (int u=(a-1);u>=i;u--)
            {
                System.out.print("*");
            }

            System.out.println("");
        }
            

    }
    public static void main(String [] args)
    {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        printTriangle(n);

    }
}