package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class HighestOccurrenceOfACharacter {
    public static void main(String[] args) {
        String s = "banana";
        highestOccurrence(s);
    }

    public static void highestOccurrence(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        char highestCharacter=' ';
        int number = 0;

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            Character ch = entry.getKey();
            Integer num = entry.getValue();

            if(num>number){
                number = num;
                highestCharacter = ch;
            }
        }
        System.out.println(highestCharacter+"="+number);
    }
}
