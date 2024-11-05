package two_dimensional_array;

import java.util.Scanner;

public class TwoDimensionalMatrix {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter the cols: ");
        int cols=sc.nextInt();
        int[][] a = new int[rows][cols];
        System.out.println("Enter the elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                System.out.println( i + " " + j + " ");
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
