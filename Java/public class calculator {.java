import java.util.*;
class calculator {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER :");
        int a=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER :");
        int b=sc.nextInt();
        System.out.println("ENTER THE OPERATOR :");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':sum(a,b);
            break;
            case '-':sub(a,b);
            break;
            case '*':mul(a,b);
            break;
            case '/':div(a,b);
            break;
            default:System.out.println("INVALID NUMBER :");


            
        }
    }
    public static void sum(int x,int y){
        int add=x+y;
        System.out.println(add);

        
    }
    public static void sub(int x,int y){
        int diff=x-y;
        System.out.println(diff);
    }
    public static void mul(int x,int y){
        int product=x*y;
        System.out.println(product);
    }
    public static void div(int x,int y){
        int divi=x/y;
        System.out.println(divi);
    }
    
}
