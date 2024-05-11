import java.util.HashMap;

public class Problem5 {

    public static String num_To_string(int year, HashMap<Integer,String> num_map){
        //Base Case
        if(year==0){
            return "";
        }
        else{
            int lastint= year%10;
            String str= num_To_string(year/10, num_map);
            str= str+ num_map.get(lastint);
            return str;
        }
    }

    public static void main(String[] args) {
        int year= 1959;
        HashMap<Integer,String> num_map= new HashMap<>();
        num_map.put(0,"Zero");
        num_map.put(1,"One");
        num_map.put(2,"Two");
        num_map.put(3,"Three");
        num_map.put(4,"Four");
        num_map.put(5,"Five");
        num_map.put(6,"Six");
        num_map.put(7,"Seven");
        num_map.put(8,"Eight");
        num_map.put(9,"Nine");

        String str= num_To_string(year,num_map);
        System.out.println(str);

    }
}
