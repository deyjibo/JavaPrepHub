import java.util.Scanner;

public class sumn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int n= sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("the sum is:"+sum);
        sc.close();;
    }
}
