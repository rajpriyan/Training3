package mahesh.raj.practicetest;

public class SubArraySum {
    public static int findSumSubArray(int[] input, int search){
        int maxSum =0;
        int currentSum=0;
        int start=0;
        int maxLength=Integer.MAX_VALUE;
        boolean returnSum;
        for(int i=0;i<input.length;i++) {
            currentSum += input[i];
            while (currentSum >= search) {
                int currentLength=i-start+1;
                if (maxLength>currentLength) {
                    maxLength=currentLength;
                    maxSum=currentSum;

                }
                currentSum -= input[start];
                start++;
            }
        }
        if(maxLength==1){
            returnSum= true;
        }
        else{
            returnSum= false;
        }
        return returnSum?maxSum:maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 2, 1};
        int K=12;
        int[] arr1 = {5, 8, 50, 4};
        int K1=50;
        System.out.println(findSumSubArray(arr,K));
        System.out.println(findSumSubArray(arr1,K1));

    }
}
