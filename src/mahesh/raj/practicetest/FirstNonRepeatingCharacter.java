package mahesh.raj.practicetest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static String findFirstNonCharcter(String input){
        HashMap<Character,Integer> hashMap = new LinkedHashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: hashMap.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey().toString();
            }
        }
        return "-1";
    }
    public static void main(String[] args) {
        String input ="abbacd";
        System.out.println(findFirstNonCharcter(input));
    }
}
