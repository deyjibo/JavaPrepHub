import java.util.Scanner;

public class factorial {
    static int facto(int x){
        int fact=1;
        for(int i=x;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no:");
        int n= sc.nextInt();
        int result=facto(n);
        System.out.println("the factorial of"+n+"is:"+result);
        sc.close();;
    }
}
