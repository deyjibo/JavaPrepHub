import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int no=sc.nextInt();
        if(no>0){
            System.out.println("the no ius positive");
        }else if(no==0){
            System.out.println("the no is zero");
        }else{
            System.out.println("the no is negetive");
        }

    }
}
