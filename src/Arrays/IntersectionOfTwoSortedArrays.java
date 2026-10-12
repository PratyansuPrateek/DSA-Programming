package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 3, 3};
        int[] nums2 = {2, 3, 3, 4, 5, 7};

        System.out.println(Arrays.toString(intersectionArray(nums1,nums2)));
    }

    public static int[] intersectionArray(int[] nums1, int[] nums2){
        int n = nums1.length;
        int m = nums2.length;

        int i = 0, j = 0;

        List<Integer> list = new ArrayList<>();

        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }

        return list.stream().mapToInt(a -> a).toArray();
    }
}
