package Test;

public class prefirxToSearchCount {
    public static int prefixSearch(String[] input, String k){
        int maxLength=0;
        for(String word: input){
         if(word.contains(k)){
               maxLength=Math.max(maxLength,word.length());
          }
        }
return maxLength;
    }
    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        System.out.println(prefixSearch(dict,toSearch));
    }
}
