


import java.util.*;
class Patterns{
    public static void main(String args[])
        {

            // Triangle

            // Scanner sc=new Scanner(System.in);
            // int n = sc.nextInt();

            // for (int i=0;i<n;i++) // 3
            // {
            //     for(int j=n-1-i;j>=1;j--)
            //     {
            //         System.out.print(" ");
            //     }
            //     for(int k=0;k<(i*2)+1;k++)
            //     {
            //         System.out.print("*");
            //     }
            //     System.out.println("");

            // }

            // for (int i=n-1;i>=0;i--){
                
            // }



            // Filled in Hollow Box

            // Scanner sc=new Scanner(System.in);
            // int n=sc.nextInt();

            // for (int i=0;i<n;i++){
            //     for (int j=0;j<n;j++){
            //         System.out.print("#");
            //     }
            //     System.out.println("");
            // }


            // System.out.println("Enter the Number : ");
            // int num=sc.nextInt();

            // for (int i=0;i<n;i++){
            //     for (int j=0;j<n;j++){

            //         if(i==0 || i==n-1){
            //             System.out.print("#");
            //         }

            //         else if(j>=1 && j<n-1){
                        
            //                 if(num>0){
            //                     System.out.print("$");
            //                     num--;

            //                 }
            //                 else{
            //                     System.out.print(" ");
            //                 }
                        
            //         }
                    
            //         else{
            //             System.out.print("#");
            //         }
            //         // else if(i==0 && i==n-1){
            //         //     System.out.print("#");
            //         // }
                    
            //         // System.out.print("#");
            //     }
            //     System.out.println("");
            // }

        

           
            
  
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();//4
            int s1=0;
            int s2=(n*n)+1;
            int s2Helper=s2;
                

            for (int i=0;i<n;i++)
            {
                for (int p=0;p<=i*2;p++)
                {
                    System.out.print(" ");
                }


                for (int j=0;j<n-i;j++)
                {
                    if(j==0)
                    {
                        System.out.print(" "+ ++s1);

                    }
                    else
                    {
                        System.out.print("*"+ ++s1);
                    }
                }

                for (int k=0;k<n-i;k++)
                {
                    System.out.print("*"+ s2++);
                }
                System.out.println();

                
                s2=s2-(n-i)-(n-i-1);
                

            }






            
        }

}


