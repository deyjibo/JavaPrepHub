interface client{
    void designweb();
    void webDevelop();
}
abstract class RajTech implements client{
    @Override
    public void designweb(){
        System.out.println("green");
    }
}
class RahulTech extends RajTech{
    @Override
    public void webDevelop(){
        System.out.println("HTML");
    }
}
public class interface_method {
    public static void main(String[] args) {
        RahulTech p=new RahulTech();
        p.designweb();
        p.webDevelop();
    }
}
