import java.util.Scanner;

public class upperlower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("enter the character:"));
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("uppercase");
        } else {
            System.out.println("Not a alphabet");
        }
        // built in method
        // if (Character.isUpperCase(ch)) {
        //     System.out.println("Uppercase letter");
        // } else if (Character.isLowerCase(ch)) {
        //     System.out.println("Lowercase letter");
        // } else {
        //     System.out.println("Not an alphabet");
        // }
        sc.close();
    }
}
