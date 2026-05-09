public class array {
    public static void main(String[] args) {
        int arr[] = new int[5];// initialize array
        int arr1[] = { 1, 2, 3, 4, 5 };// declare array
        System.out.println(arr1[0]);// print directly
        System.out.println(arr1[1]);
        arr1[1] = 6;// change the value
        System.out.println(arr1[1]);// update value
        System.out.println(arr1.length);// length of array
        for (int i = 0; i < arr.length; i++) {// access element
            System.out.print(arr1[i]);
        }
        for (int x : arr1) {//for each loop
            System.out.print(x);
        }
    }
}