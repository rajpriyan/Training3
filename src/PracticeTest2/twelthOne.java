package PracticeTest2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class twelthOne {
    public static String[] findMatchingWord(String[] input, String search){
        List<String> list = new ArrayList<>();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char a : search.toCharArray()){
            hashMap.put(a,hashMap.getOrDefault(a,0)+1);
        }
        for(String word: input){
            if(canFormWord(word,hashMap)){
                 list.add(word);
            }
        }
    return list.toArray(new String[0]);
    }

    private static boolean canFormWord(String word, HashMap<Character,Integer> hash){
        HashMap<Character,Integer> hash1= new HashMap<>();
        for(char b: word.toCharArray()){
            hash1.put(b,hash1.getOrDefault(b,0)+1);
        }
        for(char c: hash1.keySet()){
            if(hash1.get(c) > hash.getOrDefault(c,0)){
                return false;
            }
        }
return true;
    }
    public static void main(String[] args) {
        String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
        String input = "abcd";
        String[] result=findMatchingWord(dict,input);
        System.out.println(String.join(",",result));
    }
}
