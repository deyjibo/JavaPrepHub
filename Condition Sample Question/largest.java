import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st no:");
        int no1=sc.nextInt();
        System.out.println("enter the 2nd no:");
        int no2=sc.nextInt();
        if (no1>no2) {
            System.out.println("1st no is larger");
        }
        else{
            System.out.println("2nd no is larger");
        }
    }
}
