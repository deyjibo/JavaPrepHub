import java.util.Arrays;
public class copy_arr {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]=Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr2));
    }
}
