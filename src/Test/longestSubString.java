package Test;

import java.util.HashMap;

public class longestSubString {
    public static int[] findLongestSubString(String input){
        int maxLength=0;
        int startIndex=0;
        int longestStartIndex=0;
        int n =input.length();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int endIndex=0;endIndex<n;endIndex++){
            char b = input.charAt(endIndex);
            if(hashMap.containsKey(endIndex) && hashMap.get(b)>=startIndex){
                startIndex=hashMap.get(b)+1;
            }
            hashMap.put(b,endIndex);
            if(endIndex-startIndex+1>maxLength){
                maxLength=endIndex-startIndex+1;
                longestStartIndex=startIndex;
            }
        }
        return new int[]{longestStartIndex,maxLength};

    }
    public static void main(String[] args) {
        String a="aabbbbCCddd";
        int[] result=findLongestSubString(a);
        System.out.println("Index: "+result[0]);
        System.out.println("Length: "+result[1]);
        System.out.println("Length of SubString: "+a.substring(result[0],result[0]+result[1]));
    }
}
