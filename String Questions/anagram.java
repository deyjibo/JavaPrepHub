import java.util.Arrays;
public class anagram {
    public static void main(String[] args) {
        String s1="Listen";
        String s2="Silent";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }

    }
}
