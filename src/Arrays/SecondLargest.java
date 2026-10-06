package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {99,1,103,55,23,108};
        System.out.println(secondLargest(nums));
    }

    public static int secondLargest(int[] nums){
        int largest = 0;
        int secondLargest = 0;

        for(int ele : nums){
            if(largest < ele){
                secondLargest = largest;
                largest =ele;
            }else if(ele < largest && ele > secondLargest){
                secondLargest = ele;
            }
        }

        return secondLargest;
    }
}
