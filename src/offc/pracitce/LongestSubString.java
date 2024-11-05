package offc.pracitce;

import java.util.HashMap;

public class LongestSubString {
    public static int[] findLongestsubString(String input){
        int n=input.length();
        int maxLength=0;
        int startIndex=0;
        int longestStartIndex=0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int endIndex=0;endIndex<n;endIndex++){
            char b=input.charAt(endIndex);
            if(hashMap.containsKey(b) && hashMap.get(b) >= startIndex){
                startIndex=hashMap.get(b)+1;
            }
            hashMap.put(b,endIndex);
            int index=endIndex-startIndex+1;
            if(index>maxLength){
                maxLength=index;
                longestStartIndex=startIndex;
            }
        }
        return new int[]{longestStartIndex,maxLength};
    }
    public static void main(String[] args){
        String a="abbcabcbb";
        int[] result = findLongestsubString(a);
        System.out.println("Longest Sub String: "+a.substring(result[0],result[0]+result[1]));
        System.out.println("Start Index: "+result[0]);
        System.out.println("Length: "+result[1]);

    }
}
