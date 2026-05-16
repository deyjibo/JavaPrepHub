class A{//super class
    int a,b,c;
    void add(){
        int a=10,b=20;
        int c=a+b;
        System.out.println(c);
    }
    void sub(){
        int a=200,b=100;
        int c= a-b;
        System.out.println(c);
    }
}
class B extends A{//sub 1 class
    void multi(){
        int a=10,b=20;
        int c=a*b;
        System.out.println(c);
    }
    void div(){
        int a =20,b=10;
        int c=a/b;
        System.out.println(c);
    }
}
class C extends B{//sub 2 class
    void rem(){
        int a=10,b=3;
        int c=a%b;
        System.out.println(c);
    }
}
public class multilevel_inher {
    public static void main(String[] args) {
        C r=new C();
        r.add();
        r.sub();;
        r.multi();
        r.div();
        r.rem();;
    }
}
