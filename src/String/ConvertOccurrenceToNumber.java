package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConvertOccurrenceToNumber {
    public static void main(String[] args) {
        String s = "aaabbcccdee";
        System.out.println(convert(s));
    }

    public static String convert(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            sb.append(entry.getValue()).append(entry.getKey());
        }

        return sb.toString();
    }
}
