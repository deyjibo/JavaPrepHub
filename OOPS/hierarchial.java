class A {
    void input() {
        System.out.println("super class");
    }
}

class B extends A {
    void show() {
        System.out.println("sub 1 from super");
    }
}

class C extends A {
    void disp() {
        System.out.println("sub2 from super");
    }
}

public class hierarchial {
    public static void main(String[] args) {
        B r = new B();
        C r2 = new C();
        r.show();// sub1
        r.input();// super
        r2.disp();// sub2
        r2.input();// super
    }

}
