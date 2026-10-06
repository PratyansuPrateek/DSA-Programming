package Arrays;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(leftRotateByOne(nums)));
    }

    public static int[] leftRotateByOne(int[] nums){
        if(nums == null || nums.length <= 1) return nums;

        int first = nums[0];

        for(int i =0; i<nums.length-1; i++){
            nums[i]=nums[i+1];
        }

        nums[nums.length-1] = first;

        return nums;
    }
}
