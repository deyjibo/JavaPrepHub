class A{
    //constuctor overloading
    int a;
    double b;
    String c;
    A(){
        a=100;
        b=45.32;
        c="jibo";
    }
    A(int x){
        a=x;
    }
    A(double y,String z){
        b=y;
        c=z;
    }
}
public class cons_overload {
    public static void main(String[] args) {
        A r=new A();
        A r2=new A(10);
        A r3= new A(23.89,"Ankush");
        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r2.a+" "+r2.b+" "+r2.c);
        System.out.println(r3.a+" "+r3.b+" "+r3.c);

    }
}
