package Arrays;

public class RemoveDuplicateElementFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,3,3};
        System.out.println(removeDuplicate(nums));
    }

    public static int removeDuplicate(int[] nums){
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }

        return i+1;
    }
}
