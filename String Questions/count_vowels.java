public class count_vowels {
    public static void main(String[] args) {
        String s="Java";
        int count=0;
        for(int i=0;i<=s.length()-1;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("the no of vowel present:"+count);
    }
}
