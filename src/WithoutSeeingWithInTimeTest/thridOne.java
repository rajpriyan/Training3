package WithoutSeeingWithInTimeTest;

public class thridOne {
    public static String findStringSearch(String[] input,String prefix){
        StringBuilder sb= new StringBuilder();
        for(String word: input){
            if(word.contains(prefix)){
                sb.append(word).append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";
        System.out.println(findStringSearch(arr,prefix));
    }
}
