package sliding_window;

import java.util.ArrayList;
import java.util.HashSet;

public class CountOfVowelsInSubString {
        public static int countVowels(String s,String vow){
            String a=s.toLowerCase();
            int count=0;
            ArrayList<Character> arrayList=new ArrayList<>();
            for(int i=0;i<vow.length();i++){
                arrayList.add(vow.charAt(i));
            }
            for(int i=0;i<a.length();i++)
            {
                if(arrayList.contains(a.charAt(i))){
                    count++;
                }
            }
            return count;
        }

    public static void main(String[] args){
        String vow="aeiou";
        String s="JavaProgram";
        System.out.println("Count of vowels: "+countVowels(s,vow));
    }

}
