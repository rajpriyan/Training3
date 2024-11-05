package offc.pracitce;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {
    public static String nonRepeatingCharacter(String input){
        HashMap<Character,Integer> hashmap = new HashMap<>();

        for(char c: input.toCharArray()){
            hashmap.put(c,hashmap.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey().toString();
            }
        }
        return "0";
    }
    public static void main(String[] args){
        String input1="12345";
        String input2="abbacd";
        System.out.println(nonRepeatingCharacter(input1));
        System.out.println(nonRepeatingCharacter(input2));
    }
}
