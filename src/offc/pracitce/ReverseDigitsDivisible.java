package offc.pracitce;

public class ReverseDigitsDivisible {

    /*public static String reverseDivisibleByThree(String digits){
        int pos=0;
        StringBuilder stringBuilder= new StringBuilder(digits);
        StringBuilder sb= new StringBuilder();
        char[] numbers=digits.toCharArray();
        for(int i=0;i<digits.length();i++){
            int num = Character.getNumericValue(numbers[i]);
            if(num % 3 == 0){
                sb.append(digits);
            }
        }
        sb.reverse();

        for(int i=0;i<stringBuilder.length();i++){
            int number= Character.getNumericValue(numbers[i]);
            if(number % 3 == 0){
                    stringBuilder.setCharAt(i, sb.charAt(pos));
            }
            pos++;

        }
        return stringBuilder.toString();
    }*/
    public static void main(String[] args) {
        String digits = "12345632189";
        String digit2 = "1234563218976";
        System.out.println("Digit1: " + reverseDivisibleByThree(digits));
        System.out.println("Digit2: " + reverseDivisibleByThree(digit2));

    }

    public static String reverseDivisibleByThree(String digits) {
        StringBuilder sb = new StringBuilder();
        int rev = digits.length() - 1;
        int n = digits.length();
        for (int i = 0; i < n; i++) {
            int a = Character.getNumericValue(digits.charAt(i));
            if (a % 3 == 0) {
                for (int k = n - 1; k >= 0; i++) {
                    int b = Character.getNumericValue(digits.charAt(k));
                    if (b % 3 == 0) {
                        rev = k - 1;
                        a = b;
                        break;

                    }
                }
            }
            sb.append(a);

        }


        return sb.toString();
    }
}
