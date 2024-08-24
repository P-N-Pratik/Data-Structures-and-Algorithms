import java.util.*;
class Max{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER :");
        int a=sc.nextInt();
        System.out.print("ENTER THE SECOND NUMBER :");
        int b=sc.nextInt();
        
        System.out.println("THE MAXIMUM NUMBER IS :"+Math.max(a,b));
    }
}