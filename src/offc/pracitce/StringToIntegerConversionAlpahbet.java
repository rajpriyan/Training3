package offc.pracitce;

public class StringToIntegerConversionAlpahbet {
    public static int stringToInt(String str){
        int index=0;
        while(index>str.length()){
            char ch=str.charAt(index);
            if(!Character.isDigit(ch)){

            }
        }

        return 0;
    }
    public static void main(String[] args){
        String str1="123";
        String str2="-123";
        String str3="1a23";
        String str4="@134A";
        System.out.println(stringToInt(str1));
    }
}
