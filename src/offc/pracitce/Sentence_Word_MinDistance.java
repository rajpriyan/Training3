package offc.pracitce;

public class Sentence_Word_MinDistance {

    public static int sentenceMinDistance(String input,String input1, String input2){
       String[] sentence=input.split(" ");
        int minDistance=Integer.MAX_VALUE;
        int index1=-1;
        int index2=-1;
        for(int i=0;i<sentence.length;i++){
            if(sentence[i].equals(input1)){
                index1=i;
                if(index2!=1){
                    minDistance=Math.min(minDistance,index1-index2);
                }
            } else if (sentence[i].equals(input2)) {
                index2=i;
                if(index1!=-1){
                    minDistance=Math.min(minDistance,index2-index1);
                }

            }
        }

        return minDistance==Integer.MAX_VALUE?-1:minDistance;
    }
    public static void main(String[] args){
        String word = "the quick the brown quick brown the frog";
        String word1 = "quick";
        String word2 = "frog";
        int minDistance=sentenceMinDistance(word,word1,word2);
        System.out.println(minDistance);

    }
}
