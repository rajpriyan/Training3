package WithoutSeeingWithInTimeTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TenthOne {
    public static String[] stringList(String[] input,String input1){
        List<String> list= new ArrayList<>();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char c: input1.toCharArray()){
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        for(String word: input){
            if(canFormWord(word,hashMap)){
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }

    private static boolean canFormWord(String word,HashMap<Character,Integer> hashMap){
        HashMap<Character,Integer> hash= new HashMap<>();
        for(char e: word.toCharArray()){
            hash.put(e,hash.getOrDefault(e,0)+1);
        }
        for(char f:hash.keySet()){
            if(hash.get(f) > hashMap.getOrDefault(f,0)){
                return false;
            }
        }
return true;
    }
    public static void main(String[] args) {
        String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
        String input = "abcd";
        String[] result=stringList(dict,input);
        System.out.println(String.join(", ",result));
    }
}
