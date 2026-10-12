package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};

        System.out.println(Arrays.toString(unionOfArrays(nums1, nums2)));
    }

    public static int[] unionOfArrays(int[] nums1, int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j =0;

        ArrayList<Integer> list = new ArrayList<>();

        while(i < n && j < m ){
            int currentElement;

            if(nums1[i] <= nums2[j]){
                currentElement = nums1[i];
                i++;
            }else{
                currentElement = nums2[j];
                j++;
            }

            if(list.isEmpty() || list.getLast() != currentElement){
                list.add(currentElement);
            }
        }

        while(i < n){
            if(list.getLast() != nums1[i]){
                list.add(nums1[i]);
            }
            i++;
        }

        while(j < m){
            if(list.getLast() != nums2[j]){
                list.add(nums2[j]);
            }
            j++;
        }

        return list.stream().mapToInt(a -> a).toArray();
    }
}
