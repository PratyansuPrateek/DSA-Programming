package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums){

        Map<Integer, Integer> map = new HashMap<>();

        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }

        int n = nums.length;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }

        return -1;
    }
}
