interface gill{
    void add();
}
interface Raj extends gill{
    void sub();
}
class jibo implements Raj{
    @Override
    public void add(){
        int a=10,b=20;
        int c=a+b;
        System.out.println(c);
    }
    @Override
    public void sub(){
        int a=20,b=10,c;
        c=a-b;
        System.out.println(c);
    }
}
public class interface_java {
    public static void main(String[] args) {
        Raj r=new jibo();
        r.add();
        r.sub();
    }    
}
