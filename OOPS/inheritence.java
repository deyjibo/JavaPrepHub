class student{
    int roll,marks;
    String name;
    void input(){
        System.out.println("Super Class:");
        System.out.println(roll +" " +name +" "+ marks);
    }
}
class jibo extends student{
    void disp(){
        int roll=1,marks=89;
        String name="jibo";
        System.out.println("Sub class:");
        System.out.println(roll+" "+name+" "+marks);
    }
}
public class inheritence {
    //inheritance: when we construct a new class from existing in such a way that the new class access all the features and properties of existing class called inheritence
    //simple:only have one super and one sub
    public static void main(String[] args) {
        jibo r=new jibo();
        r.input();
        r.disp();;
    }
}

