public class loop {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        int i = 5;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 3);
        //infinite loop
        while (true) {
            System.out.println("Infinite");
        }
    }
}
