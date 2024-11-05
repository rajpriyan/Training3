package offc.pracitce;

public class SecondSmallestArray {
    public static int secondSmallArray(int[] input){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int num: input){
            if(num<smallest){
                secondSmallest=smallest;
                smallest=num;
            } else if (num<secondSmallest && num!=smallest) {
                secondSmallest=num;
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args){
        int[] a={2,3,1,3,3,4,6,7,8,9};
        System.out.println(secondSmallArray(a));
    }
}
