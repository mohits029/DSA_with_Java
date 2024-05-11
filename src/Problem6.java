//public class Problem6 {
//    public static int length_of_Str(String str){
//        boolean flag= true;
//        int i=0;
//        while (flag){
//            try{
//                str.charAt(i);
//                i++;
//            }catch (Exception e){
//                flag= false;
//            }
//        }
//        return i;
//
//    }
//    public static void main(String[] args) {
//        String str= "Mohit Sarkar";
//        System.out.println(str.substring(2));
//        int x= length_of_Str(str);
//        System.out.println(x);
//
//    }
//}

public class Problem6 {
    public static int length_of_Str(String str){
        //Base Case
        if(str.length()==0){
            return 0;
        }
        else{
            int x= length_of_Str(str.substring(1))+1;
            return x;
        }

    }
    public static void main(String[] args) {
        String str= "Mohit Sarkar";
        int x= length_of_Str(str);
        System.out.println(x);

    }
}