package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] nums = {99,1,111,3,100,0,5555};
        System.out.println(largestElement(nums));
    }

    public static int largestElement(int[] nums){
        int largestElement = 0;
        for (int num : nums) {
            if (largestElement < num) {
                largestElement = num;
            }
        }
        return largestElement;
    }
}
