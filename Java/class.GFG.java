// JAVA PROGRAM TO SEE HOW WE CAN CALL AN INSTANCE METHOD WITHOUT PARAMETER 
import java.io.*;
class GFG{
    public static void main(String args[]){
        GFG obj=new GFG();
        obj.disp();
        System.out.println("PARUL UNIVERSITY ");

    }
    void disp(){
        int a=100;
        System.out.println(a);
    }
}