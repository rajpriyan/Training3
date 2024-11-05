package WithoutSeeingWithInTimeTest;

public class SixthOne {
    public static int minSortArray(int[] input){
        int minArr=input[0];
        for(int num: input){
            if(num<minArr) {
                minArr = num;
            }
        }
        return minArr;
    }
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(minSortArray(arr1));
        System.out.println(minSortArray(arr2));

    }
}
