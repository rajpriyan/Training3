package PracticeTest2;

public class ThirteenOne {
    public static void palindrome(String input){
        int n=input.length();
        String reverse="";
        for(int i=n-1;i>=0;i--){
            reverse +=input.charAt(i);
        }
        System.out.println(reverse);

    }

    public static void main(String[] args) {
        String word = "forgeeksskeegfor";
       palindrome(word);

    }
}
