package PracticeTest2;

import java.util.HashMap;
import java.util.Map;

public class forthOne {
    public static String findFirstLetter(String input){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char a: input.toCharArray()){
            hashMap.put(a,hashMap.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: hashMap.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey().toString();
            }
        }
        return "0";
    }
    public static void main(String[] args) {
        String str="12345";
        String str1="abcde";
        System.out.println(findFirstLetter(str));
        System.out.println(findFirstLetter(str1));

    }
}
