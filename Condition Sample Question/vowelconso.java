import java.util.Scanner;

public class vowelconso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        if(ch>='a' && ch<='z'){
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("this is the vowel");
            }else{
                System.out.println("ot is a consonant");
            }
        }else{
            System.out.println("its not an alphabet");
        }
    }
}
