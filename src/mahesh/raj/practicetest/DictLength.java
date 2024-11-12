package mahesh.raj.practicetest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class DictLength {
    public static String findWord(String[] input, String search){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(char ch : search.toCharArray()){
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
       for(String word: input){
           if(canFormWord(word,hashMap)){
               list.add(word);
           }
       }
return list.toString();
    }
    public static boolean canFormWord(String word, HashMap<Character,Integer> hash){
        HashMap<Character,Integer> booleanHashMap = new LinkedHashMap<>();
        for(char e: word.toCharArray()){
           booleanHashMap.put(e,booleanHashMap.getOrDefault(e,0)+1);
            }
        for(char d : booleanHashMap.keySet()) {
            if (booleanHashMap.get(d) > hash.getOrDefault(d, 0)) {
                return false;
            }
        }
            return true;
        }



    public static void main(String[] args) {
        String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
        String input = "abcd";
        System.out.println(findWord(dict,input));
    }
}

