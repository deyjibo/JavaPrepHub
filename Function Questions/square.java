import java.util.Scanner;

public class square {
    static int square(int x){
        return x*x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no:");
        int n=sc.nextInt();
        int result=square(n);
        System.out.println("The square is:"+result);
        sc.close();
    }
}
