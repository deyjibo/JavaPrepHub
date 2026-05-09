public class gcd {
    public static void main(String[] args) {
        int a = 24, b = 36;
        int on1=a,on2=b;
        while (b % a != 0) {
            int rem = b % a;
            b = a;
            a = rem;
        }
        int gcd=a;
        int lcm=(on1*on2)/gcd;
        System.out.println("GCD is:" + gcd);
        System.out.println("LCM is:" + lcm);
    }
}
