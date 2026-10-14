package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        System.out.println(leader(nums));
    }

    public static List<Integer> leader(int[] nums){
        List<Integer> list = new ArrayList<>();

        if(nums == null || nums.length == 0) return list;

        int maxSoFar = nums[nums.length-1];
        list.add(maxSoFar);

        for(int i = nums.length-2; i >= 0 ; i--){
            if(nums[i]>=maxSoFar){
                maxSoFar = nums[i];
                list.add(maxSoFar);
            }
        }

        Collections.reverse(list);

        return list;
    }
}
