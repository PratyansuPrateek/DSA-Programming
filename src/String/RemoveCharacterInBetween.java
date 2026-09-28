package String;

public class RemoveCharacterInBetween {
    public static void main(String[] args) {
        String s = "zzzopzip";
        System.out.println(zipZap(s));
    }

    public static String zipZap(String s){
        StringBuilder result = new StringBuilder();

        int i=0;

        while(i<s.length()){
            if(i+2<s.length() && s.charAt(i)=='z' && s.charAt(i+2)=='p'){
                result.append("zp");
                i+=3;
            }else{
                result.append(s.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
