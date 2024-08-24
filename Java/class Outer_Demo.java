class Outer_Demo
{
    private int num = 175; 

public class Inner_Demo
{
public int getNum()
{
    System.out.println("This is the get num method of the inner class");
    return num;
        }
    }
}


class My_class2
{
public static void main(String args[])
{

    Outer_Demo outer = new Outer_Demo();//initiaating outer class
    Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();//initiating inner class
    System.out.println(inner.getNum()); 
    }
}
