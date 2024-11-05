package WithoutSeeingWithInTimeTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstOne {
    public static String findStringCount(String input){
        StringBuilder sb= new StringBuilder();
        HashMap<Character,Integer> hashMap = new LinkedHashMap<>();
        for(int i=0;i<input.length();i++){
            char in=input.charAt(i);
            if(hashMap.containsKey(in)){
               int count=hashMap.get(in);
               hashMap.put(in,++count);
            }
            else{
                hashMap.put(in,1);
            }

        }
        for(Map.Entry<Character,Integer> entry: hashMap.entrySet()){
            sb.append(entry.getKey()).append(entry.getValue());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String a="aabbb";
        String b="aaaa";
        String c="a";
        System.out.println(findStringCount(a));
        System.out.println(findStringCount(b));
        System.out.println(findStringCount(c));
    }
}
