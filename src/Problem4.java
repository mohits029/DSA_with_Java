import java.util.ArrayList;
public class Problem4 {
    public static void findOccurrence(int arr[], int key,int i, ArrayList<Integer> result){
        if(arr== null || i== arr.length ){
            return;
        }
        if(arr[i]==key){
            result.add(i);
        }
        findOccurrence(arr,key, i+1, result);
        return;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,3,2,2,2,4,4,2};
        int key = 2;

        ArrayList<Integer> result= new ArrayList<>();
        findOccurrence(arr, key,0, result);
        System.out.println(result);
    }
}
