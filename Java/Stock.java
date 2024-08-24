import java.util.Scanner;


class Stock
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        

        // int currentValue[]={100,200,300,400};
        // int futureValue[]={200,300,400,500};

        System.out.println("Enter the Number of the Stocks you want :");
        int stocks=sc.nextInt();

        int currentValue[]=new int[stocks];
        for(int i=0;i<stocks;i++)
        {
            System.out.print("Enter the Value for the "+i+"th Index as per the Current Values of the Stocks :");
            int value=sc.nextInt();
            currentValue[i]=value;
        }

        int futureValue[]=new int[stocks];
        for(int i=0;i<stocks;i++)
        {
            System.out.print("Enter the Value for the "+i+"th Index as per the predicted Future Values of the Stocks :");
            int value=sc.nextInt();
            futureValue[i]=value;
        }
        

        //Printing the Current Values of the Stock 
        for(int i=0;i<stocks;i++)
        {
            System.out.println(currentValue[i]+"\t");

        }

        //Printing the Future Values of the Stock
        for(int i=0;i<stocks;i++)
        {
            System.out.println(futureValue[i]+"\t");

        }


        System.out.println("Enter the Number of Stocks you want to Purchase :");
        int noOfStocks=sc.nextInt();

        if (noOfStocks<=stocks)
        {
                
            int stockListToBePurchased[]=new int[noOfStocks];
            
            for (int i=0;i<noOfStocks;i++)
            {
                System.out.println("Enter the Index Number of the Stock you want to purchase :");
                int stockIndex=sc.nextInt();
                stockListToBePurchased[i]=stockIndex;


            }

            int totalPriceOfThePurchasedStocksAsPerTheCurrentValue=0;

            for(int i=0;i<noOfStocks;i++)
            {
                int index=stockListToBePurchased[i];
                totalPriceOfThePurchasedStocksAsPerTheCurrentValue+=currentValue[index];

            }

            int totalPriceOfThePurchasedStocksAsPerTheFutureValue=0;

            for(int i=0;i<noOfStocks;i++)
            {
                int index=stockListToBePurchased[i];
                totalPriceOfThePurchasedStocksAsPerTheFutureValue+=futureValue[index];

            }

            int totalProfit=totalPriceOfThePurchasedStocksAsPerTheFutureValue-totalPriceOfThePurchasedStocksAsPerTheCurrentValue;

            System.out.println("The Total Profit after 1 year ="+totalProfit);


            }
        



        

    }
}



            // int n=new int[3];
