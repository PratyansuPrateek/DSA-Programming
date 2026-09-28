package String;

public class Program5 {
    public static void main(String[] args) {
        String s = "my name is happy";
        System.out.println(reverseWord(s));
    }

    public static String reverseWord(String s){
        String[] arr = s.split(" ");

        StringBuilder result = new StringBuilder();

        for(int i= arr.length-1; i>=0; i--){
            result.append(arr[i]);

            if(i>0){
                result.append(" ");
            }
        }

        return result.toString();
    }
}
