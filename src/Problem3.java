public class Problem3 {

    public static void febonacci(int n, int a, int b){
        if(n==0){
            return;
        }
        System.out.print(a+b+" ");
        int temp= a;
        a=b;
        b=b+temp;
        febonacci(n-1,a,b);
        return;
    }
    public static void main(String[] args) {
        //febonacci
        int n= 7;
        int a=0;
        int b=1;


        febonacci(n,a,b);

    }
}
