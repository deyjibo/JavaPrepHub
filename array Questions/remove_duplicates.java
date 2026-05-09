public class remove_duplicates {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4,4,5,5};
        for(int i=0;i<arr.length-1;i++){
            boolean isduplicate=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isduplicate=true;
                    break;
                }
            }
            if(!isduplicate){
                System.out.print(arr[i]+" ");
            }

        }
    }
}
