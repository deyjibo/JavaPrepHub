public class sumn {
    static int csum(int x){
        int sum=0;
        for(int i=1;i<=x;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int result=csum(5);
        System.out.println(result);
    }
}
