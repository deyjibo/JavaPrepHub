import java.util.*;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int number=sc.nextInt();
        int original=number;
        int rev=0;
        while(number!=0){
            int digit=number%10;
            rev=rev*10+digit;
            number=number/10;
        }
        if(original==rev){
            System.out.println("pallindrome");
        }else{
            System.out.println("not pallindrome");
        }

    }
}
