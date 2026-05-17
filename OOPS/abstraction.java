abstract class animal{
    public abstract void sound();
    animal(){
        System.out.println("all sound");
    }
}
class Dog extends animal{
    Dog(){//constructor called super after that object created
        super();
    }
    public void sound(){
        System.out.println("barking");
    }
}
class lion extends animal{//not have cvonstructor but call constructor and it calls super class
    public void sound(){
        System.out.println("roaring");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Dog r=new Dog();
        lion l=new lion();
        r.sound();
        l.sound();
    }   
}
