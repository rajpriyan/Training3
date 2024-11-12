package simulation_test;

public class MatrixDiagonal {
    public static void main(String[] args) {
      int[] a ={1,3,4,2,4,5,6};
      int largest=Integer.MIN_VALUE;
      int secondLargest =Integer.MIN_VALUE;
      for(int num: a){
          if(num>largest) {
              secondLargest = largest;
              largest = num;
          }
          else if (num > secondLargest && num < largest) {
              secondLargest = num;
          }
      }
      System.out.println(secondLargest);
    }
}
