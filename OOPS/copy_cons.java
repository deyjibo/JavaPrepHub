class A{
    int a;
    String b;
    A(){
        a=10;b="Lion";
        System.out.println(a+" "+b);
    }
    A(A ref){
        a=ref.a;//copy
        b=ref.b;//copy
        System.out.println(a+" "+b);
    }
}
public class copy_cons {
    public static void main(String[] args) {
        A r=new A();
        A r2=new A(r);   
    }
}
