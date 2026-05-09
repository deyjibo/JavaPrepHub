public class search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key=6;
        boolean found=false;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==key){
                found=true;
            }
        } 
        if(found){
            System.out.println("found");
        }else{
            System.out.println("not exist");
        }
    }
}
