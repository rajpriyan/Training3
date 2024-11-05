package sliding_window;

public class SlidingWindow {
    public static int findWindowsum(int[] a,int k){
        int windowSum=0;
        int result=0;
        for(int i=0;i<k;i++){
            result+=a[i];
            windowSum=result;
        }
        for(int i=1;i<a.length-k+1;i++){
            windowSum=windowSum-a[i-1]+a[i+k-1];
            if(windowSum>result){
                result=windowSum;
            }
        }
        return result;

    }
    public static void main(String[] args){
        int[] a={2,1,4,5,3,7,9,11};
        int k=4;
        System.out.println(findWindowsum(a,k));
    }

}
