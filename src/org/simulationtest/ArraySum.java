package org.simulationtest;

public class ArraySum {
    public static int arrSum(int[] input,int k){
        int sum = 0;
        for(int i=input.length-k;i< input.length;i++){
            sum +=input[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] card={2,2,2};
        int checkPoint=2;
        System.out.println(arrSum(card,checkPoint));

    }
}
