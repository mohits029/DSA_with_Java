public class Permutation {

    public static void totalPermutation(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curr= str.charAt(i);
            String new_str= str.substring(0,i)+ str.substring(i+1);
            totalPermutation(new_str, ans+curr);

        }


    }
    public static void main(String[] args) {
        String str= "abc";
        totalPermutation(str,"");
    }
}
