import java.util.*;
class EvenOdd{
    public static void main(String args[]){
        System.out.print("ENTER THE NUMBER :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
             System.out.println("THE NUMBER IS EVEN ");

        }else{
            System.out.print("THE NUMBER IS ODD ");
        }
    }
}