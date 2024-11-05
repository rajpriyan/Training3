package offc.pracitce;

public class StarRemoveString {
        public static String removeStar( String input)
        {
            StringBuilder sb = new StringBuilder();
            for (Character ch : input.toCharArray()) {
                if (ch == '*')
                {
                    if(sb.length() > 0)
                    {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                }
                else {
                    sb.append(ch);
                }

            }
            return sb.toString();
        }
        public static void main(String[] args) {
            String input1 = "leet**cod*e";
            String input2 = "erase*****";
            String input3= "**Raj*";
            System.out.println(" Result of the input1: " + removeStar(input1));
            System.out.println(" Result of the input2: "  + removeStar(input2));
            System.out.println(" Result of the input3: "  + removeStar(input3));
        }
    }

