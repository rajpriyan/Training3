package mahesh.raj.practicetest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {
    public static String findCharCount(String input){
        StringBuilder sb= new StringBuilder();
        HashMap<Character,Integer> hashMap = new LinkedHashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: hashMap.entrySet()){
            sb.append(entry.getKey()).append(entry.getValue());
        }
       return sb.toString();
    }
    public static void main(String[] args) {
        String input = "aabbb";
        System.out.println(findCharCount(input));
    }
}
