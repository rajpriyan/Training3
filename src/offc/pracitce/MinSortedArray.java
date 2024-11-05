package offc.pracitce;

public class MinSortedArray {
    public static int findMin(int[] arr){
        int minArr=arr[0];
        for(int num : arr){
            if(num<minArr){
                minArr=num;
            }

        }
        return minArr;
    }
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={2,3,4,5,6,2,0,-1};
        System.out.println(findMin(arr1));
        System.out.println(findMin(arr2));
    }
}
