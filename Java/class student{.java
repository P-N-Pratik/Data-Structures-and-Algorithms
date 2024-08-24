class student{
    int rollno;
    String name;

    void insertinfo(int r,String n){
        rollno=r;
        name=n;

    }
    void displayinfo(){
        System.out.print(rollno+" "+name);
    }
}
class studentinfo{
    public static void main(String args[]){
        student s1=new student();
        student s2=new student();
        s1.insertinfo(111,"megha");
        s2.insertinfo(112,"megha");
        System.out.print("THE ROLLNO AND NAME OF THE STUDENT IS:");
        s1.displayinfo();
        s2.displayinfo();

    }
}