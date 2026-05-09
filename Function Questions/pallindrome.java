import java.util.Scanner;

public class pallindrome {
    static void pall(int x){
        int original=x;
        int rev=0;
        while(x!=0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        if(original==rev){
            System.out.println("pallindrome");
        }else{
            System.out.println("not pallindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no:");
        int n=sc.nextInt();
        pall(n);
        sc.close();;
    }
}
