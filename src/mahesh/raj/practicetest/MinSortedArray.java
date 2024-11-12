package mahesh.raj.practicetest;

public class MinSortedArray {
    public static int findMinSortArray(int[] array){
        int left=0;
        int right=array.length-1;
        if(array.length==0){
            return -1;
        }
        if (array.length==1){
            return array[0];
        }
        while(left<right){
            int mid = left + (right-left)/2;
            if(array[mid]<array[mid-1]){
                return array[mid];
            }
            if(array[mid]>array[mid+1]){
                return array[mid+1];
            }
            if(array[left]<array[mid]){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        System.out.println(findMinSortArray(arr));
    }
}
