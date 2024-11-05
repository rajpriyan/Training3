package offc.pracitce;

public class StringSubStiringLength {
        public static int subArr(int[] input, int n) {
            int start = 0;
            int currentSum = 0;
            int minLength = Integer.MAX_VALUE;
            int maxSum = 0;

            for (int i = 0; i < input.length; i++) {
                currentSum += input[i];

                while (currentSum >= n) {
                    int currentLength = i - start + 1;

                    if (currentLength < minLength) {
                        minLength = currentLength;
                        maxSum = currentSum; // Update the maximum sum if needed
                    }
                    currentSum -= input[start];
                    start++;
                }
            }

            // If no valid subarray is found, return 0 or an indication (e.g., -1)
            return (minLength == Integer.MAX_VALUE) ? 0 : maxSum; // Return the maxSum of the smallest valid subarray
        }

        public static void main(String[] args) {
            int[] arr = {2, 4, 6, 10, 2, 1};
            int K = 12;
            int[] arr1 = {5, 8, 50, 4};
            int K1 = 50;
            System.out.println(subArr(arr, K));  // Output: 16 (6 + 10)
            System.out.println(subArr(arr1, K1)); // Output: 50
        }
    }


