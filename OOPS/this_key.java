class A{
    int a;
    A(){
        System.out.println("default cons");
    }
    A(int a){
        //this.a=a;
        this();
        System.out.println(a);
    }
    void disp(){
        System.out.println(a);
    }
    void show(){
        System.out.println(this+ " this storage indicates same thing");
    }
}
public class this_key {
    public static void main(String[] args) {
        A r=new A(100);
        System.out.println(r+ " normal storage");
        r.show();
        r.disp();
    }
}
