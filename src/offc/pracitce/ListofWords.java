package offc.pracitce;

public class ListofWords {

    public static int findlengthestword(String[] input, String search){
        int maxLength=0;
        for(String word : input){
            if(word.toLowerCase().contains(search.toLowerCase())){
                maxLength = Math.max(maxLength,word.length());
            }
        }
        return maxLength;
    }
    public static void main(String [] args){
        String[] dict =  {"CODGE", "ODG", "LODGES", "SODG", "dodgeytyfgg", "mODJ", "LODGESSSS"};
        String toSearch="ODG";
        System.out.println("length of words: " + findlengthestword(dict,toSearch));
        }
    }

