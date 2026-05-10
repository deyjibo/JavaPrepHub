class A{
    int a;
    String b;
    A(int x,String y){//parameterized Constructor
        a=x;
        b=y;
    }
    void show(){
        System.out.println(a+" "+b);
    }

}
public class para_cons {
    public static void main(String[] args) {
        A r=new A(100,"Ankush");
        r.show();
    }
}
