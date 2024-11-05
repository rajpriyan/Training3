package PracticeTest2;

import java.util.HashSet;

public class TenthOne {
    public static int findSmallestInteger(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num: arr){
            hashSet.add(num);
        }
        int smallestInetger = 0;
        while(hashSet.contains(smallestInetger)){
            smallestInetger++;
        }
     return smallestInetger;
    }
    public static void main(String[] args) {
        int[] arr1={3,4,1,2,5};
        System.out.println(findSmallestInteger(arr1));
    }
}
