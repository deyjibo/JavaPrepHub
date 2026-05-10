import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String s = sc.nextLine();//full sentence
        System.out.println("Enter name:");
        String name = sc.next();//single word
        System.out.println(s);
        System.out.println(name);
        sc.close();
    }
}
