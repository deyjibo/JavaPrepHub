public class prime {
    static void check(int x){
        int count=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime no");
        }else{
            System.out.println("not prime");
        }
    }
    public static void main(String[] args) {
        check(50);
    }
}
