import java.util.Arrays;
public class Pairsum {
    public static boolean findPair(int nums[], int target){
        Arrays.sort(nums);
        int low= 0;
        int high= nums.length-1;
        int sum=0;

        while (low < high) {
            sum= nums[low]+ nums[high];
            if(sum==target){
                return true;
            }
            if(sum < target){
                low++;
            }
            else{
                high--;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int nums[]= {11, 15, 26, 38, 9, 10};
        int x=35;
        System.out.println(findPair(nums, x));
    }
}
