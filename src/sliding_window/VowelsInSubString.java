package sliding_window;


public class VowelsInSubString {
    public static int vowelsCount(String word) {
            int count=0;
            String vowels="aeiou";
            for(int i=0;i<word.length();i++){
                for(int j=i;j<word.length();j++){
                    String subString=word.substring(i,j+1);
                    for(char c: subString.toCharArray()){
                        if(vowels.indexOf(c)!=-1){
                            count++;
                        }
                    }
                }
            }
            return count;
        }
        public static void main(String[] args){
        String word="nsezukxxfizmsyklbnapslntyoxcqringkizyfwrkzlnrnlngpfbrnvjgarsnsnwpcypisjzwdulvywhamnilpsxnikkobaozgptrxsdavgnixjillcvrayliscjizartkfsfdmukxxctslolfezijrysjpqxgatdkhoggxqifewcuctgwviudzjwigbjacreernsoampabfnysygtxzkgkgxopgajgxdzjicwtvacqvrxndlqyzothxkwmhaxljbjrnybgjlllcxwzuzagpamznwtjdwxsyxooamybmcmurafztbapmqvhdbfbutuqqwhphwhpaddikphtztrttpjrffzydanseiueeboywpmifxbbytipxtgmmxpvbsvlwhodqzfqjqgywlgkkpedsypqtcxzncxknwqlbranuizejweoiesutcbteisociddiukjyobxpucmgyayythrpgwalljklfjtigedzgxntxnrmsbkugjtkpuxyxfiyctaucbpkjkjiwcwegqonqivauvchbfeyqqxkzvojphogqrnjnmsxnikjwktoyppoubttoljwvdcgahjbxgdlhcafpomugaivakyazwtqfmrymbijbisoncqthfrftgjqdzrxllnbxajqnwyleloohwidiphhoscagvxmskvfrrnbgjbcjaljcxyuxzgbanlltcqnvbyjdmclqrcjjylshjvvvhhxckipbyglfobhfgldtwdapzjberhcsnphfmdopruonmduyrpyiagufgqdtbiswbfymexqgakdlpaybplicrgczhtbfgxwktxebrpybkrtohaheupiupsshrevvwyrtygnwlogdrwqqzonvifgacejcrdgzhyhqqrpmnptxnqkplnsiyovgmrurlausdbxaabmkpmjvpiambnskgqwztithfimhwchkhfjsrfplcquuudsnwjaqfawrvlolljhvwakxzduhgbebmkenrb";         System.out.println(vowelsCount(word));

        }
    }

