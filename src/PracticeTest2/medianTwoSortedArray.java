package PracticeTest2;

import java.util.Arrays;

public class medianTwoSortedArray {
public static int findMedian(int[] num1,int[] num2){
    int median=0;
    int num3[]=new int[num1.length+num2.length];
    int index=0;
    for(int i=0;i<num1.length;i++){
        num3[index]=num1[i];
        index++;
    }
    while(index<num3.length){
        for(int j=0;j<num2.length;j++){
            num3[index]=num2[j];
            index++;
        }
    }
    for(int k=0;k<num3.length-1;k++){
        for(int l=0;l<num3.length-1-k;l++){
            if(num3[l]>num3[l+1]){
                int temp=num3[l];
                num3[l]=num3[l+1];
                num3[l+1]=temp;
            }
        }
    }
    int n=num3.length/2;
    int n1=num3.length;
    if(num3.length%2!=0){
        median=num3[n];
    }
    else{
            median = (num3[n]+n1)/2;
    }

    return median;
}
    public static void main(String[] args) {

        int nums1[] = {2, 3, 5, 8};
        int nums2[] = {10, 12, 14, 16, 18, 20};
        System.out.println(findMedian(nums1,nums2));
    }
}
