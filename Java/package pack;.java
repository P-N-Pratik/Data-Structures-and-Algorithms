public class A{
    public void message(){
        System.out.println("WELCOME TO JAVA ");
    }

}

class B{
    public static void main(){
        A obj=new A();
        obj.message();
    }
}