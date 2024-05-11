public class Sub_String {
    // find substring using recursion
    public static int count_sub_string(String str, int i, int count){
        if(i== str.length()){
            return count;
        }
        String sub_str= "";
        for(int end=i; end< str.length(); end++){
            sub_str+= str.charAt(end);
//            System.out.println(sub_str);
            //check the first and last character is same
            if(sub_str.charAt(0) == sub_str.charAt(sub_str.length()-1)){
                count++;
            }
        }
        int x= count_sub_string(str, i+1, count);
        return x;
    }
    public static void main(String[] args) {
        String str= "abca";
        int x= count_sub_string(str, 0,0);
        System.out.println(x);
    }
}
