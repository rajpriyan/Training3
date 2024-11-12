package mahesh.raj.practicetest;

public class WordCount {
    public static int findWordDistance(String input,String input1, String input2){
        int index1=-1;//1
        int index2=-1;
        int minLength =Integer.MAX_VALUE;
        String[] sentence = input.split(" ");
        for(int i=0;i<sentence.length;i++){
            if(sentence[i].equals(input1)){
                index1=i;
                if(index2!=1){
                    minLength =Math.min(minLength,index1-index2);
                }else if(sentence[i].equals(input2)){
                    index2=1;
                    if(index1!=1){
                        minLength =Math.min(minLength,(index2-index1));
                    }
                }

            }

        }
        return minLength;
        }
    public static void main(String[] args) {
        String str = "the quick the brown quick brown the frog";
        String word1 = "quick";
        String word2 = "frog";
        System.out.println(findWordDistance(str,word1,word2));
    }
}
