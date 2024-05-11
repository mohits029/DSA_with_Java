public class Problem2 {

    public static int sum(int i){
        // base case
        if(i== 0){
            return 0;
        }
        int x= sum(i-1)+ i;
        return x;
    }

    public static void main(String[] args) {
        //sum of n natural number
        int n= 10;
        System.out.println(sum(n));
    }
}
