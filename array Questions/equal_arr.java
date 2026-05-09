public class equal_arr {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 1, 2, 3 };
        boolean equal = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                equal = false;
                break;
            }
        }
        if (equal)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
