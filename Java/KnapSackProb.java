// import java.util.*;//1901
// import java.util.Arrays;

// import javax.sound.midi.Soundbank;


// class KnapSackAlgo
// {
    
//     public void FKP(int arr[][],int W,int w)
//     {
//         System.out.println("The List of the Array Products That has been passed as an Arguement to this Function :");
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr[j].length;j++)
//             {
//                 System.out.print(arr[i][j]+"\t");
//             }
//             System.out.println("");
//         }


//         int rBC=w;
//         Integer profRatioArr[]=new Integer[W];
//         int NewProfRatioArr[][]=new int[W][W];
//         for(int i=0;i<W;i++)
//         {
//             // int profRatio=(arr[i][2]/arr[i][1]);
//             // profRatioArr[i]=profRatio;

//             profRatioArr[i]=(arr[i][2]/arr[i][1]);
            


//         }

//         Arrays.sort(profRatioArr,Collections.reverseOrder());
        
//         System.out.println("");
//         System.out.println("The List of the Profit/weight Ratio sorted in the Desccending Order is :");
        

//         for(int i=0;i<W;i++)
//         {
//             System.out.print(profRatioArr[i]+"\t");
//         }

//         System.out.println("");
//         // System.out.println("The List of the Profit/weight Ratio Sorted in the Descending Order is:");
//         // for(int i=0;i<W;i++)
//         // {
//         //     System.out.print(profRatioArr[i]+"\t");
//         // }

//         // for (int i=0;i<W;i++)
//         // {
//         //     if((arr[i][2]/arr[i][1])>profRatioArr[i])
//         //     {
             
//         //         NewProfRatioArr[i+1]=NewProfRatioArr[i];
//         //         NewProfRatioArr[i]=arr[i];
                



//         //     }
//         // }
//         // while(flag=0)
//         // {
//         //     for (int i=0;i<W;i++)
//         //     {
//         //         int flag=0;
//         //         if((arr[i][2]/arr[i][1])==profRatioArr[i])
//         //         {
                
//         //             // NewProfRatioArr[i+1]=NewProfRatioArr[i];
//         //             // NewProfRatioArr[i]=arr[i];
//         //             NewProfRatioArr[i]=arr[i];
//         //             i++;



//         //         }
//         //         else if ((arr[i][2]/arr[i][1])!=profRatioArr[i])
//         //         {
//         //             i++;
//         //         }
                
//         //     }
//         // }

//         System.out.println("");
//         int flag=0;
//         int count=0;//1
//         System.out.println("The List of the Profit/weight Ratio Sorted in the Descending Order is:");
//         for (int i=0;i<W;i++)
//         {
            
            
//             for (int j=count;j<W;j++)
//             {
                
//                 if(flag==0 || count>=1)
//                 {
                    
//                     if((arr[j][2]/arr[j][1])==profRatioArr[count])
//                     {
                    
//                         // // NewProfRatioArr[i+1]=NewProfRatioArr[i];
//                         // // NewProfRatioArr[i]=arr[i];
//                         // System.out.println(arr[j]);
//                         // //NewProfRatioArr[j]=arr[j];
                        
//                         // j++;
//                         NewProfRatioArr[count][0]=arr[j][0];
//                         NewProfRatioArr[count][1]=arr[j][1];
//                         NewProfRatioArr[count][1]=arr[j][2];

//                         count++;
                        
                        

//                     }
//                     else
//                     {
//                         flag=1;
                        
                        
//                     }

//                 }
//                 else
//                 {
//                     continue;
                    

//                 }
//                 // if((arr[j][2]/arr[j][1])==profRatioArr[count])
//                 // {
                
//                 //     // // NewProfRatioArr[i+1]=NewProfRatioArr[i];
//                 //     // // NewProfRatioArr[i]=arr[i];
//                 //     // System.out.println(arr[j]);
//                 //     // //NewProfRatioArr[j]=arr[j];
                    
//                 //     // j++;
//                 //     NewProfRatioArr[count][0]=arr[j][0];
//                 //     NewProfRatioArr[count][1]=arr[j][1];
//                 //     NewProfRatioArr[count][1]=arr[j][2];

//                 //     count++;
                    
                    

//                 // }
//                 // else
//                 // {
//                 //     flag=1;
                    
                    
//                 // }

//             }
//             i++;
//         }
//         // System.out.println(" ");
//         // System.out.println("List of the Array (Products) sorted acoording to the Profit/weight Ratio is:");
//         // for(int i=0;i<W;i++)
//         // {
//         //     System.out.print(NewProfRatioArr[i]+"\t");
//         // }

//         for(int i=0;i<NewProfRatioArr.length;i++)
//         {
//             for(int j=0;j<NewProfRatioArr[j].length;j++)
//             {
//                 System.out.print(NewProfRatioArr[i][j]+"\t");
//             }
//             System.out.println("");
//         }
        
        

//     }
//     // public void printArray(int W)
//     // {
//     //     for(int i=0;i<W;i++)
//     //     {
//     //         System.out.println(profRatioArr[i]);
//     //     }
//     // }


// }

// public class KnapSackProb
// {
//     public static void main(String[] args)
//     {
//     KnapSackAlgo m=new KnapSackAlgo();   
//     // System.out.println("Enter the Capacity of the bag :");
//     int BAG_WEIGHT = 25;
//     KnapSackAlgo obj=new KnapSackAlgo();
//     int products[][]={{1,3,12},{2,6,12},{3,2,6},{4,8,8},{5,5,16},{6,9,18}};
//     int w=products.length;


//     System.out.println("The List of the Array Products That has been Still not  passed as an Arguement to the Function :");
//     for(int i=0;i<w;i++)
//     {
//         for(int j=0;j<products[j].length;j++)
//         {
//             System.out.print(products[i][j]+"\t");
//         }
//         System.out.println("");
//     }

    
//     System.out.println();
//     obj.FKP(products,w,BAG_WEIGHT);
//   //obj.printArray(w);
//     }

// }

// //Arrays.sort(array, Collections.reverseOrder());