package mahesh.raj.practicetest;

public class PrefixSearch {
    public static String findPrefixWord(String[] input,String search){
        StringBuilder sb=new StringBuilder();
        for(String word: input){
            if(word.startsWith(search)){
                sb.append(word).append(",");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";
        System.out.println(findPrefixWord(arr,prefix));
    }
}
