class A{
    int a,b;
    //static block: is such kind of block in java which gets executed at the time of loading the .class file into java memory  
    //instance block: is similar method which has no name it can be written inside a class only but not inside a method
    {
        a=10;b=20;
        System.out.println(a+" "+b+ " instance block ");
    }
    static{
        System.out.println("learn Java class outside main");
    }
    void show(){
        a=50;
        b=60;
        System.out.println(a+" "+b+ " method");
    }
    A(){
        a=30;
        b=40;
        System.out.println(a+" "+b+ " constructor");
    }
}
public class static_instance {
    static{
        System.out.println("learn Java static inside main");
    }
    public static void main(String []args){
        A r =new A();
        r.show();
    }
}
