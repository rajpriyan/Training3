package offc.pracitce;

public class MergeStringWithSpace {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb= new StringBuilder();
        int length = word1.length();
        int length1= word2.length();
        int min_length=Math.min(length,length1);

        for(int i=0;i<min_length;i++){
            sb.append(word1.charAt(i)).append(' ');
            sb.append(word2.charAt(i)).append(' ');
        }
        for (int i = min_length; i < length; i++) {
            sb.append(word1.charAt(i)).append(' ');
        }

        for (int i = min_length; i < length1; i++) {
            sb.append(word2.charAt(i)).append(' ');
        }


        return sb.toString().trim();
    }
    public static void main(String [] args){
        String word1="ab";
        String word2="pqr";
        System.out.println("Merged words: "+ mergeAlternately(word1,word2));
    }
}
