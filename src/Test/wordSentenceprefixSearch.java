package Test;

public class wordSentenceprefixSearch {
    public static int wordSentence(String input,String word1, String word2){
        int minDistance=Integer.MAX_VALUE;
        String[] word=input.split(" ");
        int index1=-1;
        int index2=-1;
        for(int i=0;i<word.length;i++)
        {
            if(word[i].equals(word1)){
                index1=i;
                if(index2!=1) {
                    minDistance = Math.min(minDistance, index1-index2);
                }
            } else if (word[i].equals(word2)) {
                index2=i;
                if(index1!=1){
                    minDistance=Math.min(minDistance,index2-index1);
                }
            }
        }
return minDistance==Integer.MAX_VALUE?-1:minDistance;
    }
    public static void main(String[] args) {
        String str = "the quick the brown quick brown the frog";
        String word1 = "quick";
        String word2 = "frog";
        System.out.println(wordSentence(str,word1,word2));
    }
}
