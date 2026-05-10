class A{
    int a;
    String name;
    A(){//default constructor
        a=0;
        name=null;        
    }
    void show(){
        System.out.println(a+" "+name);
    }
}
public class cons {
    public static void main(String[] args) {
        A r=new A();
        r.show();
    }
}
