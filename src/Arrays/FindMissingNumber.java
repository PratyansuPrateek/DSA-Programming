package Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums){
        int n = nums.length;
        int actualSum = n * (n+1) / 2;
        int sum = 0;

        for(int ele : nums){
            sum+=ele;
        }

        return actualSum-sum;
    }
}
