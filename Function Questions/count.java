public class count {
    static int cdigit(int x){
        int count=0;
        while(x!=0){
            count++;
            x=x/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int result=cdigit(654789);
        System.out.println(result);
    }
}
