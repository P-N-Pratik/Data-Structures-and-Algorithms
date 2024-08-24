class KnapSackZeroOneProblem
{
    public static int KSZOP(int wt[],int p[],int w,int n)
    {
        int[][] dp = new int[n + 1][w + 1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<w+1;j++)
            {
                if(i==0||j==0)
                {
                    dp[i][j]=0;

                }
                else if(wt[i-1]<=j)
                {
                    dp[i][j]=Math.max(dp[i-1][j],p[i-1]+dp[i-1][j-wt[i-1]]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][w];
    }


    public static void main(String [] args)
    {
        int wt[]={1,2,4,5};
        int p[]={4,4,4,15};
        int w=8;
        int n=wt.length;
        System.out.println(KSZOP(wt,p,w,n));

    }

}