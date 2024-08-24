import java.util.*;


class SpyProblem
{
    public static void main(String[] args)
    {

        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> maxlist=new ArrayList<Integer>();
        maxlist.add(0);


        int arr[]={3,1,5,7};
        int max=Integer.MIN_VALUE;


        for (int i=0;i<arr.length;i++)
        {
            int sum=arr[i];
            list.add(i);
            for (int j=i+2;j<arr.length;j+=2)
            {
                if(i==0)
                {
                    if(j!=arr.length-1 )
                    {
                        sum+=arr[j];
                        list.add(j);
                    }
                }
                else
                {
                    
                    sum+=arr[j];
                    list.add(j);
                    

                }

            }

            if(sum>max)
            {
                max=sum;
                maxlist.clear();
                for(int k=0;k<list.size();k++)
                {
                    maxlist.add(list.get(k)+1);
                    

                }
            }
            list.clear();

        }

        System.out.println("Max : "+ max);
        for (int i=0;i<maxlist.size();i++)
        {
            System.out.print(maxlist.get(i)+" ");
        }



    }
}