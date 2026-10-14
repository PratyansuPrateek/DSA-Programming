package Arrays;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, -1, -3, -4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];

        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {
            if (num < 0) {
                ans[negIndex] = num;
                negIndex += 2;
            } else {
                ans[posIndex] = num;
                posIndex += 2;
            }
        }

        return ans;
    }
}
