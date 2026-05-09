import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int no=sc.nextInt();
        if (no%5==0) {
            System.out.println("divisible by 5");
        }else if(no%11==0){
            System.out.println("divisible by 11");
        }else{
            System.out.println("not divisible by 5 & 11");
        }
        sc.close();
    }
}
