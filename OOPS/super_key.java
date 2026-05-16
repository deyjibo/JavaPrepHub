class A{
    int a=10;
    A(){
        System.out.println("Hello "+ a );
    }
}
class B extends A{
    int a=20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class super_key {
    public static void main(String[] args) {
        B r=new B();
        r.show();
    }
}
