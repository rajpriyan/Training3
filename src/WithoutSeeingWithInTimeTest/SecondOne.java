package WithoutSeeingWithInTimeTest;

public class SecondOne {
    public static int findPrefixCount(String[] dict, String toSearch){
       int maxLength=0;
        for(String word: dict){
            if(word.contains(toSearch)){
                maxLength=Math.max(maxLength,word.length());
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        System.out.println(findPrefixCount(dict,toSearch));
    }
}
