class shape{
    void draw(){
        System.out.println("cant say");
    }
}
class square extends shape{
    @Override
    void draw(){
        System.out.println("square");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        shape r=new square();
        r.draw();
    }
}
