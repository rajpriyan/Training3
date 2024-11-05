package Test;

import java.util.HashMap;
import java.util.Map;

public class firstNonrepeatingCharacter {
    public static String firstNon(String input){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char e: input.toCharArray()){
                hashMap.put(e,hashMap.getOrDefault(e,0)+1);
        }
        for(Map.Entry<Character,Integer> map : hashMap.entrySet()){
            if(map.getValue()==1){
                return map.getKey().toString();
            }
        }
        return "0";
    }
    public static void main(String[] args) {
        String a="112345";
        String b="12345";
        String c="aabbcca";
        String d="abaa";
        System.out.println(firstNon(a));
        System.out.println(firstNon(b));
        System.out.println(firstNon(c));
        System.out.println(firstNon(d));
    }
}
