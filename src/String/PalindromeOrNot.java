package String;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String s = "malayalam";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;

        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
