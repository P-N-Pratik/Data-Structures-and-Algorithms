import java.util.*;//1901
import java.util.Arrays;

import javax.sound.midi.Soundbank;


class KnapSackAlgo
{
    
    public void FKP(int arr[][],int W,int w)
    {
        int lengthOfProductArray=W;
        int rBc=w;
        Integer profRatioArr[]=new Integer[W];
        int NewProfRatioArr[][]=new int[W][W/2];
        int SackTheBag=w;
        int ProfitOfSackTheBag=0;


        System.out.println("The List of the Array Products That has been passed as an Arguement to this Function :");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[j].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }


        for(int i=0;i<W;i++)
        {
            // int profRatio=(arr[i][2]/arr[i][1]);
            // profRatioArr[i]=profRatio;

            profRatioArr[i]=(arr[i][2]/arr[i][1]);
        }

        Arrays.sort(profRatioArr,Collections.reverseOrder());
        
        System.out.println("");
        System.out.println("The List of the Profit/weight Ratio sorted in the Desccending Order is :");
        for(int i=0;i<W;i++)
        {
            System.out.print(profRatioArr[i]+"\t");
        }


        System.out.println("");
        System.out.println("");
        System.out.println("The length of W inside the Function is:"+ lengthOfProductArray);


        System.out.println("New Algorithm has been Applied");
        for (int i=0;i<W-1;i++)
        {
            for (int j=0;j<W-1-i;j++)
            {

                
                if ((arr[j][2]/arr[j][1])>(arr[j+1][2]/arr[j+1][1]))
                {
                    NewProfRatioArr[j][0]=arr[j][0];
                    NewProfRatioArr[j][1]=arr[j][1];
                    NewProfRatioArr[j][2]=arr[j][2];

                    arr[j][0]=arr[j+1][0];
                    arr[j][1]=arr[j+1][1];
                    arr[j][2]=arr[j+1][2];

                    arr[j+1][0]=NewProfRatioArr[j][0];
                    arr[j+1][1]=NewProfRatioArr[j][1];
                    arr[j+1][2]=NewProfRatioArr[j][2];


                }

            }
        }

            

    
    
        System.out.println("The List of the Array Products That has been Sorted acoording to the prof/Ratio But in the Ascending Order and we want it to to be in the Descending Order ::");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[j].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }

       

        System.out.println("The list of the Array Products That has been Sorted acoording to the prof/Ratio and also in the Descending Order that is, one who has the Highest Profit/weight ratio is the first in the List :");
        for(int i=W-1;i>=0;i--)
        {
            for (int j=0;j<(W/2);j++)
            {
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println("");
        }
    

    // Now only the Array has been Sorted In the Descending Order Acoording to the Profit/Weight ratio
        System.out.println("hello");
        for(int i=0;i<arr.length;i++)
        {
            if (SackTheBag==0)
            {
                break;
            }
            else if(arr[i][1]<=SackTheBag)
            {
                SackTheBag-=arr[i][1];   //25-3=23
                ProfitOfSackTheBag=+arr[i][2];   //12

            }
            else if(arr[i][1]>SackTheBag)
            {
                ProfitOfSackTheBag+=(((SackTheBag)/arr[i][1])/arr[i][2]);
                SackTheBag=0;

            }
        }

        System.out.println("Hello"+SackTheBag);
        System.out.println(ProfitOfSackTheBag);

    }
    
}



public class KnapSackInProgress
{
    public static void main(String[] args)
    {
    KnapSackAlgo m=new KnapSackAlgo();   
    // System.out.println("Enter the Capacity of the bag :");
    int BAG_WEIGHT = 25;
    KnapSackAlgo obj=new KnapSackAlgo();
    int products[][]={{1,3,12},{2,6,12},{3,2,6},{4,8,8},{5,5,16},{6,9,18}};
    

    int w=products.length;
    System.out.println("The length of the Array Named Products is :"+ w);


    System.out.println("The List of the Array Products That has been Still not  passed as an Arguement to the Function :");
    for(int i=0;i<w;i++)
    {
        for(int j=0;j<products[j].length;j++)
        {
            System.out.print(products[i][j]+"\t");
        }
        System.out.println("");
    }

    
    System.out.println();
    obj.FKP(products,w,BAG_WEIGHT);
  //obj.printArray(w);
    }

}

//Arrays.sort(array, Collections.reverseOrder());

