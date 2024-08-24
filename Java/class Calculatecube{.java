import java.util.*;
class Calculatecube{
    static int cube(int x){
        return x*x*x;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER :");
        int a=sc.nextInt();
        int cube=cube(a);
        System.out.print(cube);
    }
}