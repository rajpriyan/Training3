package sliding_window;

import java.util.LinkedList;
import java.util.List;

public class MaxSlidingWindow {
    public static int findMaxWindowArray(int[] a, int k){
        int result=0;
        List<Integer> list=new LinkedList<>();
            for(int i=0;i<k;i++){
                result=Math.max(a[i],result);
                list.add(a[i]);
            }
            for(int i=1;i<a.length-1;i++){
                list.add(a[i]);

            }
            return result;
    }
    public static void main(String[] args) {
        int[] a={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(findMaxWindowArray(a,k));
    }
}
