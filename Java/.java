class Test{
    int x=10;
    int y=20;
    void show(){
        System.out.println(x);
        System.out.println(y);

    }
    void display(){
        System.out.println(x);
        System.out.println(y);

    }
    public static void main(String[] args){
        Test t1=new Test();
        t1.show();
        t1.display();
        Test t2=new Test();
        t1.show();
        t2.display();

    }
}