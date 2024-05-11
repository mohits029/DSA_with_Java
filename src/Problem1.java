public class Problem1 {
    public static int fact(int a){
        //base case
        if(a== 0 || a==1){
            return 1;
        }
         int x= fact(a-1) * a;
        return x;
    }
    public static void main(String[] args) {
        int a=6;
        System.out.println(fact(a));
    }
}
