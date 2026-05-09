import java.util.Scanner;

public class reverse {
    static int norev(int x){
        int rev=0;
        while(x!=0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no:");
        int n=sc.nextInt();
        int result=norev(n);
        System.out.println(result);
        sc.close();;
    }
}
