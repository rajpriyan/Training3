package PracticeTest2;

public class NInethOne {
    public static int findSmallestInteger(int[] arr) {
        int n=arr.length;
        if(n==0|| arr[0]>0){
            return 0;
        }
        for(int i=0;i<n;i++){
            if(i==arr[i]) {
                continue;
            }
            else {
                return i;
            }
        }
        return n;
    }    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {0, 1, 3, 4};
        System.out.println(findSmallestInteger(arr1));
        System.out.println(findSmallestInteger(arr2));
    }
}
