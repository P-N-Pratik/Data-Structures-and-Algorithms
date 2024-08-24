// JAVA PROGRAM TO DEMONSTRATE THE TYPES OF INSTANCE METHODS
import java.io.*;
import java.util.*;
class account
{

 private int balance = 100;

 public int getBalance()
 {
 return balance;
 }
 
 public void setBalance(int a)
 {
 
 balance += a;
 }
}

class GFG
{
 public static void main(String[] args)
 {

    Scanner sc=new Scanner(System.in);
 account obj = new account();
 System.out.print("ENTER THE AMOUNT :");

 int b=sc.nextInt();
 
 
 obj.setBalance(b);
 

 System.out.println("Your Balance : "+ obj.getBalance());
 
 System.out.println("PARUL");
 }
}