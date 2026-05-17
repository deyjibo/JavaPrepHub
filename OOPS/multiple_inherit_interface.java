interface A{
    void show();
}
interface B{
    void show ();
}
class Multi implements A,B{
    public void show(){
        System.out.println("A and B");
    }
}
public class multiple_inherit_interface {
    public static void main(String[] args) {
        Multi m=new Multi();
        m.show();
    }
}
