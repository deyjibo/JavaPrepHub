import java.util.Scanner;

interface client{
    void m1();//by default abstract,public static,final
    void input();
    void output();
}
class dev implements client{
    String name;
    double sal;
    public void m1(){
        System.out.println("abstract method");
    }
    public void input(){
        Scanner r=new Scanner(System.in);
        System.out.println("enter username:");
        name=r.nextLine();
        System.out.println("salary:");
        sal=r.nextDouble();
    }
    public void output(){
        System.out.println("the salary of"+name +"is"+ sal);
    }
}
public class interface_oops {
    public static void main(String[] args) {
        client c=new dev();
        c.input();
        c.output();
    }
}
