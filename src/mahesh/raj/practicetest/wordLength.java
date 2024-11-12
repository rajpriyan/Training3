package mahesh.raj.practicetest;

public class wordLength {
    public static int findWordLength(String[] input, String search){
       int maxLength=0;
       for(String word: input){
           int wordLength = word.length();
           for(int i=0;i<wordLength-search.length();i++){
               boolean match = true;
               for(int j=0;j<search.length();j++){
                   if(word.charAt(i+j)!=search.charAt(j)){
                       match=false;
                       break;
                   }
               }
               if (match){
                   maxLength=Math.max(maxLength,wordLength);
                   break;
               }
           }
       }
       return maxLength;
    }
    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        System.out.println(findWordLength(dict,toSearch));
    }
}
