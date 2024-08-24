
import java.util.*;
class DoorProblem{
    public static void main(String args[]){

        // 0=open and 1=close

        Scanner sc=new Scanner(System.in);
        int noOfDoors=sc.nextInt();  // 3
        int noOfStudents[] = new int[noOfDoors];//3//0 1 2
        // for (int i=0;i<noOfStudents.length;i++){
        //     noOfStudents[i]=0;
        // }

        // for (int i=0;i<noOfStudents.length;i++){
        //     System.out.println(noOfStudents[i]);
        // }

        

        int students=noOfDoors;
        for (int i=1;i<=students;i++){
            for (int j=0;j<noOfStudents.length;j++){

                if(i==1)
                {
                    break;

                    
                }
                else if((j+1)%i==0){
                    if(noOfStudents[j]==1){
                        noOfStudents[j]=0;
                    }
                    else{
                        noOfStudents[j]=1;
                    }
                }


            }



        }

        int openedDoors=0;

        for(int i=0;i<noOfStudents.length;i++){
            if(noOfStudents[i]==0){
                openedDoors++;
            }

        }

        System.out.println(" Opened Doors are :" + openedDoors);



    }
}