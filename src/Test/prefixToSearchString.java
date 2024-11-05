package Test;

public class prefixToSearchString {
    public static String prefixSearchString(String[] input,String k){
        StringBuilder sb= new StringBuilder();
        for(String word:input){
            if(word.contains(k)){
                sb.append(word).append(" ");
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";
        System.out.println(prefixSearchString(arr,prefix));
    }
}
