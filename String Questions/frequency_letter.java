public class frequency_letter {
    public static void main(String[] args) {
        String s="Java";
        for(int i=0;i<s.length();i++){
            int count=1;
            if(s.charAt(i)==' '){
                continue;
            }
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            boolean alreadyPrinted=false;
            for(int k=0;k<i;k++){
                if(s.charAt(i)==s.charAt(k)){
                    alreadyPrinted=true;
                    break;
                }
            }
            if(!alreadyPrinted){
                System.out.println(s.charAt(i)+"="+count);
            }
        }
    }
}
