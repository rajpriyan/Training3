package PracticeTest2;

import java.util.Map;

public class fifthOne {
    public static int findMinDistance(String input, String word1, String word2){
        int minDistance=Integer.MAX_VALUE;
        int index1=-1;
        int index2=-1;
        String[] sentence=input.split(" ");
        for(int i=0;i<sentence.length;i++){
            if(sentence[i].equals(word1)){
                index1=i;
                if(index1!=-1){
                    minDistance=Math.min(minDistance,index1-index2);
                }
            } else if (sentence[i].equals(word2)) {
                index2=i;
                if(index2!=-1){
                    minDistance=Math.min(minDistance,index2-index1);
                }

            }

        }

        return minDistance;
    }
    public static void main(String[] args) {
        String str = "the quick the brown quick brown the frog";
        String word1 = "quick";
        String word2 = "frog";
        System.out.println(findMinDistance(str,word1,word2));

    }
}