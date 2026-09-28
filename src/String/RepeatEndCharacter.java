package String;

public class RepeatEndCharacter {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello",3));
    }

    public static String repeatEnd(String s, int n){
        int length = s.length();

        String s1 = s.substring(length-n);
        String result="";

        for(int i=0; i<n; i++){
            result += s1;
        }

        return result;
    }
}
