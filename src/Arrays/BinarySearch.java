package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,6,7,8,9,11,18};
        System.out.println(binarySearch(nums,8));
    }

    public static int binarySearch(int[] nums, int target){
        int i=0;
        int j= nums.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                j= mid-1;
            }else{
                i= mid+1;
            }
        }

        return -1;
    }
}
