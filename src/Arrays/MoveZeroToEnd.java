package Arrays;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] nums = {0,1,4,0,5,2};
        System.out.println(Arrays.toString(moveZero(nums)));
    }

    public static int[] moveZero(int[] nums){
        int i = 0;

        for(int j=0; j<nums.length; j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
        }

        while (i<nums.length){
            nums[i]=0;
            i++;
        }

        return nums;
    }
}
