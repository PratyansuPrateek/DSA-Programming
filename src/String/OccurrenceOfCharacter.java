package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurrenceOfCharacter {
    public static void main(String[] args) {
        String s="banana";
        occurrence(s);
    }

    public static void occurrence(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " = " + value);
        }
    }
}
