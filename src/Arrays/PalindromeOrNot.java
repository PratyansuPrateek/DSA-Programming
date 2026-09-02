package Arrays;

public class PalindromeOrNot {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2,1};
        System.out.println("Is Array is palindrome: "+ isPalindrome(nums));
    }

    public static boolean isPalindrome(int[] nums){
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]!=nums[j])
                return false;

            i++;
            j--;
        }
        return true;
    }
}
