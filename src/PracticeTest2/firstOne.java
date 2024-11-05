package PracticeTest2;

import java.util.HashMap;
import java.util.Map;

public class firstOne {
    public static String findCountString(String input){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0;i<input.length();i++){
            char b= input.charAt(i);
            if(hashMap.containsKey(b)){
                int count=hashMap.get(b);
                hashMap.put(b,++count);
            }
            else{
                hashMap.put(b,1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry: hashMap.entrySet()){
            sb.append(entry.getKey()).append(entry.getValue());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String a="aabbb";
        System.out.println(findCountString(a));
    }
}
