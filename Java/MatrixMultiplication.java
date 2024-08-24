import java.util.Scanner;

class Input
{
	Scanner sc=new Scanner(System.in);
	
	/**
	 * @param a
	 * @param n
	 */
	public void input(int a[][],int n){
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
			
		}
	}
}
}

public class MatrixMultiplication{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Input in=new Input();
		int arr[][]=new int[3][3];
		in.input(arr[][],3);
		
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};
		int c[][]=new int[3][3];
		in.input(a[][],b[][],3);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]=0;
				for(int k=0;k<3;k++){
					c[i][j]+=a[i][k]*b[k][j];
						
				}
				System.out.print(c[i][j]+"  ");
					
					
				
			
			
		//System.out.println();
		/***for(int m=0;m<3;m++){
			for(int n=0;n<3;n++){
			System.out.println(c[m][n]);
			}
		}***/
	}
	System.out.println();
	}
		


	}
}

	