package Test;

public class MissingIntegerArray {
    public static int findMissingInteger(int[] input){
        int actualSum=0;
        int n=input.length+1;
        int expectedSum=n*(n+1)/2;
        for(int num:input){
            actualSum+=num;
        }
        return expectedSum-actualSum;
    }
    public static void main(String[] args) {
        int[] a={1,2,4,5,6};
        System.out.println(findMissingInteger(a));
    }
}
