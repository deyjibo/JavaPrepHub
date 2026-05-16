class A{
    void add(){
        int a=10,b=20;
        int c= a+b;
        System.out.println(c);
    }
    void add(int a ,int b){
        int c= a+b;
        System.out.println(c);
    }
    void add(int a,double b){
        double c= a+b;
        System.out.println(c);
    }
}
public class method_overloading {
    public static void main(String[] args) {
        System.out.println("Method Overloading");
        A r=new A();
        r.add();
        r.add(10, 20);
        r.add(10, 10.20);
    }
}
