package offc.pracitce;

public class MedianOfTwoSortedArrays {
    public static int medianSort(int[] arr1,int[] arr2){
        int a=arr1.length; int b=arr2.length;
        int median=(a+b)/2;
        int left=0; int right=b-1;
        int mid= left + (right-left)/2;
        int index=median-mid;
        int max=Math.max(mid,a);
        int max1=Math.max(index,b);

        return 0;
    }
    public static void main(String[] args){
        int[] arr1={1,2,4,6,9,11,13,17};
        int[] arr2={7,9,13,17,18,21,22,23};
        System.out.println(medianSort(arr1,arr2));

    }
}
