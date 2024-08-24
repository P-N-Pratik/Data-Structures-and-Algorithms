import java.util.*;
class bank{
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("INSERT THE PIN NUMBER :");
        int pin=input.nextInt();
        int bal=15000;
        int pinchances=3;
        
        while(true){
            if(pin==1111 || pin==2222){
                int choice;
                System.out.print("1.BALANCE\n 2.WITHDRAM\n 3.DEPOSITE \n");
                choice=input.nextInt();
                switch(choice){
                    case 1:
                    System.out.print("THE CURRENT BALANCE IS :");
                    System.out.print(bal);
                    break;
                    case 2:
                    System.out.print("ENTER THE AMOUNT IN THE MULTIPLES OF 100 TO BE WiTHDRAWN :");
                    int amount=input.nextInt();
                    if(amount%100==0){
                        bal-=amount;
                        System.out.print("THE CURRENT BALANCE IS :");
                        System.out.print(bal);
                    }
                    else{
                        System.out.print("INVALID AMOUNT");
                    }
                    break;
                    case 3:
                    System.out.print("ENTER THE AMOUNT IN THE MULTIPLES OF 100 TO BE DEPOSITED :");
                    
                    int dep=input.nextInt();
                    if(dep%100==0){
                        bal+=dep;
                        System.out.print("THE CURRENT BALANCE IS :");
                        System.out.print(bal);
                    }
                    else{
                        System.out.print("INVALID AMOUNT");
                    }
                  
                    break;
                    


                }
            }
            else{
               System.out.print("INCORRECT PIN");
               System.out.print("CHANCES REMAINING");
               System.out.print(--pinchances);
            }
            if(pinchances==0){
                System.out.print("NO CHANCES LEFT");
            }
        }



    }
}