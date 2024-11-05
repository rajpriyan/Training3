package offc.pracitce;

import java.util.HashMap;
import java.util.Map;

public class StringtoIntegerConversion {

    public static String occuranceCharCount(String input) {
        int b = input.length();
        HashMap<Character, Integer> c = new HashMap<>();
        for (int i = b - 1; i >= 0; i--) {
            char d = input.charAt(i);
            if (c.containsKey(d)) {
                int count = c.get(d);
                c.put(d, ++count);
            } else {
                c.put(d, 1);

            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Character, Integer> e : c.entrySet()) {
            stringBuilder.append(e.getKey()).append( e.getValue());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String input = "aabbbycyyc";
        System.out.println(occuranceCharCount(input));

    }
}
