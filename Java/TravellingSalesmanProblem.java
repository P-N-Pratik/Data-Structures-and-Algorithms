
import java.util.*;

class TravellingSalesmanProblem
{







    public static int min(int a)
    {
        int minimum=465676;
        if(a<minimum)
        {
            minimum=a;

        }
        return minimum;
    }





    public static void g(int sv,Set<Integer> set)

    {


        int graph[][]=
        {
            {0,0,0,0,0},
            {0,0,10,15,20},
            {0,5,0,9,10},
            {0,6,13,0,12},
            {0,8,8,9,0}
        };
        // for (int k=sv+1;k<graph.length;k++)
        // {
        //     min(graph[sv][k]+g(k));
        // }


    
        
    //     for(Integer k:set) 
        

            
    //         System.out.println(k);
            
    //         //int ans=min(graph[sv][k]+g(k,set));
            
            

        
    //     set.remove(2);
            

    
        

    // }

    for(Integer values:set)
    {
        // System.out.print(values+"\t");
        // set.remove(values);
        // int ans=min(graph[sv][values]+g(values,set));
        // System.out.print("Inside The Function g :");
        // System.out.println(values);

        System.out.println(set.contains(values));


    }

    // for (int k=0;k<set.size();k++)
    // {
    //     System.out.println(set.contains(k));
    // }
}






    public static void main(String [] args)
    {


        int graph[][]=
        {
            {0,0,0,0,0},
            {0,0,10,15,20},
            {0,5,0,9,10},
            {0,6,13,0,12},
            {0,8,8,9,0}
        };

        int startingvertex=1;

        Set<Integer> set=new HashSet<Integer>();
        int arrOfRemainingVertex[]=new int[graph.length-2];
        for (int i=startingvertex+1;i<graph.length;i++)
        {
            set.add(i);
            // System.out.println(set);

        }
        System.out.println(set);
        



        // for (int i=startingvertex+1;i<graph.length;i++)
        // {
        //     System.out.println(i);
        //     arrOfRemainingVertex[i-2]=i;
        // }

        // for (int i=0;i<arrOfRemainingVertex.length;i++)
        // {
        //     System.out.print(arrOfRemainingVertex[i]+"\t");
        // }


        // for(Integer k:set) 
        // {
            
            
        //     g(sv,set)=min(graph[sv][k]+g(k,set=set.remove(k)));
        //     //System.out.println(k);
            

        // }











        g(startingvertex,set);
        



    }





}