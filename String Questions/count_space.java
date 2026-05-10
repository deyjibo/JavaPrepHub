public class count_space {
    public static void main(String[] args) {
        String s = "Hello Java World";
        System.out.println(s.length());
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
