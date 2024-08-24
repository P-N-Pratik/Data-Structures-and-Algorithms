import java.util.*;//1901
import java.util.Arrays;

import javax.sound.midi.Soundbank;


class KnapSackAlgo
{
    
    public void FKP(int arr[][],int W,int w)
    {
        System.out.println("The List of the Array Products That has been passed as an Arguement to this Function :");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[j].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }

        int lengthOfProductArray=W;
        int rBC=w;
        Integer profRatioArr[]=new Integer[W];
        int NewProfRatioArr[][]=new int[W][W/2];
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
        // System.out.println("The List of the Products Just transferred from Products Array to NewProfratioArr");
        // for (int i=0;i<W;i++)
        // {
        //     NewProfRatioArr[i][0]=arr[i][0];
        //     NewProfRatioArr[i][1]=arr[i][1];
        //     NewProfRatioArr[i][2]=arr[i][2];
        // }
        // int flag=0;
        // int count=0;
        // for (int i=0;i<W;i++)
        // {
        //     for (int j=count;j<W;j++)
        //     {
        //         if(flag==0 || count>=1)
        //         {
        //             if((arr[j][2]/arr[j][1])==profRatioArr[count])
        //             {
        //                 NewProfRatioArr[j][0]=arr[count][0];
        //                 NewProfRatioArr[j][1]=arr[count][1];
        //                 NewProfRatioArr[j][2]=arr[count][2];

        //                 count++;
        //             }else
        //             {
        //                 flag=1;
        //             }
                    

        //         }

        //     }
        // }


        // int pointer=0;
        // int pointertoprofRatioArr=0;
        // for (int i=0;i<W;i++)
        // {
            
        //     if((arr[i][2]/arr[i][1])==profRatioArr[pointertoprofRatioArr])
        //     {
                
        //         NewProfRatioArr[pointer][0]=arr[i][0];
        //         NewProfRatioArr[pointer][1]=arr[i][1];
        //         NewProfRatioArr[pointer][2]=arr[i][2];
        //         pointertoprofRatioArr++;
        //         pointer++;

        //     }
        //     else
        //     {
                


        //     }
        // }
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
                // else
                // {
                //     // NewProfRatioArr[j][0]=arr[j+1][0];
                //     // NewProfRatioArr[j][1]=arr[j+1][1];
                //     // NewProfRatioArr[j][2]=arr[j+1][2];
                //     continue;

                // }


            }
        }

            

    
        

    




        // System.out.println("The List of the Profit/weight Ratio Sorted in the Descending Order is:");
        // for(int i=0;i<NewProfRatioArr.length;i++)
        // {
        //     for(int j=0;j<NewProfRatioArr[j].length;j++)
        //     {
        //         System.out.print(NewProfRatioArr[i][j]+"\t");
        //     }
        //     System.out.println("");
        // }
        System.out.println("The List of the Array Products That has been Sorted acoording to the prof/Ratio But in the Ascending Order and we want to to be in the Descending Order ::");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[j].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }

       

        System.out.println("The list of the Array Products That has been Sorted acoording to the prof/Ratio But and also in the Descending Order that is one who has the Highest Profit/weight is the first in the List :");
        for(int i=W-1;i>=0;i--)
        {
            for (int j=0;j<(W/2);j++)
            {
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println("");
        }
    }
    
        
        

}
    // public void printArray(int W)
    // {
    //     for(int i=0;i<W;i++)
    //     {
    //         System.out.println(profRatioArr[i]);
    //     }
    // }




public class KnapSack
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

