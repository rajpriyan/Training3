package offc.pracitce;

public class findShortestArray {

    public static int findShortestSubArray(int[] a, int K) {
        int start = 0;
        int current_sum = 0;
        int min_length = Integer.MAX_VALUE;
        int min_sum = Integer.MAX_VALUE;
        boolean returnSum1;

        for (int i = 0; i < a.length; i++) {
            current_sum += a[i];

            while (current_sum >= K) {
                int current_length = i - start + 1;
                if (current_length < min_length) {
                    min_length = current_length;
                    min_sum = current_sum;
                }
                current_sum -= a[start];
                start++;
            }
        }

        if(min_length == 1)
        {
            returnSum1 = true;
        }else
        {
            returnSum1 = false;
        }

        if (min_length == Integer.MAX_VALUE) {
            return -1;
        }

        return returnSum1 ? min_sum : min_length;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 10, 2, 1};
        int[] b = {5, 8, 50, 4};
        int K1 = 12;
        int K2 = 50;
        System.out.println(findShortestSubArray(a, K1));
        System.out.println(findShortestSubArray(b, K2));
    }
}
