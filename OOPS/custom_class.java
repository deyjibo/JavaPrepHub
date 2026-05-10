class Demo{
    int a=10;//data
    int b=20;//data
    void show(){//method
        System.out.println(a+b); //result
    }
}
public class custom_class{
    public static void main(String[] args) {
        Demo r=new Demo();
        r.show();
    }
}