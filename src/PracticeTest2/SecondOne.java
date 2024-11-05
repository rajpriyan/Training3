package PracticeTest2;

public class SecondOne {
    public static int findPrefix(String[] input, String prefix){
        int maxLength=0;
        for(String word: input){
            if(word.contains(prefix)){
                maxLength=Math.max(maxLength,word.length());
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        System.out.println(findPrefix(dict,toSearch));
    }
}
