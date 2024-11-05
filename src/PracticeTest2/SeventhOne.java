package PracticeTest2;

public class SeventhOne {
    public static int findSubArray(int[] input,int sub){
        int currentSum=0;
        int maxLength=Integer.MAX_VALUE;
        int maxSum=Integer.MAX_VALUE;
        int start=0;
        boolean returnSum;
        for(int i=0;i<input.length;i++){
            currentSum+=input[i];
            while(currentSum>=sub){
                int currentLength=i-start+1;
                if(currentLength<maxLength){
                    maxLength=currentLength;
                    maxSum=currentSum;
                }
                currentSum -=input[start];
                start++;
            }
        }
        if(maxLength==1){
            returnSum=true;

        }
        else{
            returnSum=false;
        }

    return returnSum?maxSum:maxLength;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 10, 2, 1};
        int K1 = 12;
        int[] arr2 = {5, 8, 50, 4};
        int K2 = 50;
        System.out.println(findSubArray(arr1,K1));
        System.out.println(findSubArray(arr2,K2));
    }
}
