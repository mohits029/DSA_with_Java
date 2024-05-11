
/*
Question4:WearegivenastringS,weneedtofindthecountofallcontiguoussubstringsstarting and ending with the same character.
Sample Input 1: S = "abcab"Sample Output 1: 7There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca,
bcab, c, ca, cab, a, ab, bOutoftheabovesubstrings,thereare7substrings:a,abca,b,bcab,c,aandb.So,only 7 contiguous substrings
start and end with the same character.
 */

import java.util.ArrayList;
public class Problem7 {

// substring using brute force
    /*
    public static void contiguous_substring(String str){
        for(int i=0; i<str.length(); i++){
            String sub_str= "";
            for(int j=i; j< str.length(); j++){
                sub_str+= str.charAt(j);
                System.out.println(sub_str);
            }
        }
    }
    */

    //another way to find substring using brute force

    public static ArrayList<String> contiguous_substring(String str){
        ArrayList<String> sub_str_list= new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            String sub_str;
            for(int j=i; j< str.length(); j++){
                sub_str= str.substring(i,j+1);
                sub_str_list.add(sub_str);
            }
        }
        return sub_str_list;
    }

    public static void main(String[] args) {
        String str= "abcab";
        ArrayList<String> sl;
        ArrayList<String> start_ends_with_same_char= new ArrayList<>();
        sl= contiguous_substring(str);

        for (String sub_str: sl){
            if(sub_str.charAt(0)==(sub_str.charAt(sub_str.length()-1))){
                start_ends_with_same_char.add(sub_str);
            }
        }

        System.out.println(sl);
        System.out.println(start_ends_with_same_char);

    }
}
