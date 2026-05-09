import java.util.Scanner;

public class evenodd {
    static void check(int x){
        if(x%2==0){
            System.out.println("even no");
        }else{
            System.out.println("odd no");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int n=sc.nextInt();
        check(n);
        sc.close();
    }
}
