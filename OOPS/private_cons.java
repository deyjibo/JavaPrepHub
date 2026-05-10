public class private_cons {
    int a;
    double b;
    String c;
    private private_cons(){
        a=10;
        b=30.56;
        c="jibo";
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        private_cons r=new private_cons();
    }
}
