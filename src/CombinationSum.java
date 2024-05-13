import java.util.ArrayList;

public class CombinationSum {
    public static void allCombination(int idx, int[] arr, int target, ArrayList<Integer> ans){
        //Base case
        if(idx== arr.length){
            if(target==0){
                System.out.println(ans);
            }
            return;
        }

        if(arr[idx]<= target){
            ans.add(arr[idx]);
            allCombination(idx, arr,target-arr[idx], ans);
            ans.remove(ans.size()-1);
        }
        allCombination(idx+1, arr, target, ans);
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,6,7};
        int target= 8;
        ArrayList<Integer> ans= new ArrayList<>();
        allCombination(0,arr, target, ans);
    }
}
