public class copy_arr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr2[]=new int[arr.length];
        for(int i=0;i<=arr.length-1;i++){
            arr2[i]=arr[i];
        }
        for(int i=0;i<=arr2.length-1;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
