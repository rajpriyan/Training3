package Test;

import java.util.HashMap;
import java.util.Map;

public class countOfVowels {
    public static String countOfString(String input) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        for (int i = input.length() - 1; i >= 0; i--) {
            char d = input.charAt(i);
            if (hashMap.containsKey(d)) {
                int count = hashMap.get(d);
                hashMap.put(d, ++count);
            } else {
                hashMap.put(d, 1);
            }
        }
            for(Map.Entry<Character,Integer> e: hashMap.entrySet()) {
                sb.append(e.getKey()).append(e.getValue());
            }
            return sb.toString();
    }

        public static void main (String[]args){
            String a = "aabbb";
            String b = "aaaa";
            String c = "a";
            System.out.println(countOfString(a));
            System.out.println(countOfString(b));
            System.out.println(countOfString(c));


        }
    }
