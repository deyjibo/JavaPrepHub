import java.util.Scanner;

public class roots {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("From the equtation extract a,b,c and put the value...");
        System.out.println("enter the a ");
        double a=sc.nextDouble();
        System.out.println("enter the b");
        double b=sc.nextDouble();
        System.out.println("enter the c");
        double c=sc.nextDouble();
        double D=b*b-4*a*c;
        if(D>0){
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Two real and different roots");
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);
        }else if(D==0){
            double root = -b / (2 * a);
            System.out.println("Two real and equal roots");
            System.out.println("Root = " + root);
        }else{
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.println("Roots are complex:");
            System.out.println("Root1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root2 = " + realPart + " - " + imaginaryPart + "i");
        }       
    }
}
