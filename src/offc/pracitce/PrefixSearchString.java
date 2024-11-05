package offc.pracitce;

public class PrefixSearchString {

    public static String prefixSearch(String[] arr,String prefix){
        StringBuilder sb = new StringBuilder();
        for(String word: arr){
            if(word.contains(prefix)){
                sb.append(word).append(",");
            }

        }
        return sb.toString();
    }
    public static void main(String[] args){
        String[] arr = {"apple","applet","bread"};
        String prefix="app";
        System.out.println(prefixSearch(arr,prefix));

    }
}
