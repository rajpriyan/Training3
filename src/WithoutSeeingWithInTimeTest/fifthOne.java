package WithoutSeeingWithInTimeTest;

import java.util.HashMap;
import java.util.Map;

public class fifthOne {
    public static String firstNonRepeatingCharacter(String input){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char c: input.toCharArray()){
                hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> map : hashMap.entrySet()){
            if(map.getValue()==1){
                return map.getKey().toString();
            }
        }
    return "0";
    }
    public static void main(String[] args) {
        String str1 = "12345";
        String str2 = "abbacd";
        System.out.println(firstNonRepeatingCharacter(str1));
        System.out.println(firstNonRepeatingCharacter(str2));
    }
}
