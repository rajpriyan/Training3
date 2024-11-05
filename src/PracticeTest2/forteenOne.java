package PracticeTest2;

public class forteenOne {
        public static void main(String[] args) {
            dotestCases();
        }

        public static int dotestCases() {
            int[] a = {0};
            int[] b = {0, 1};
            int[] c = {0, 2, 1, -2, 3, -3, -1};
            boolean result = true;

            result &= secondSmallest(a) == Integer.MAX_VALUE;  // Handling edge case for a
            result &= secondSmallest(b) == 1;  // b has a second smallest: 1
            result &= secondSmallest(c) == -2; // c has second smallest: -2

            if (result) {
                System.out.println("All test cases passed");
            } else {
                System.out.println("All test cases failed");
            }

            return 0;  // Could be a success indicator or omitted
        }

        // Helper method to find the second smallest element
        public static int secondSmallest(int[] arr) {
            if (arr == null || arr.length < 2) {
                return Integer.MAX_VALUE;  // Return a value indicating no valid second smallest
            }

            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

            for (int num : arr) {
                if (num < smallest) {
                    secondSmallest = smallest;
                    smallest = num;
                } else if (num < secondSmallest && num != smallest) {
                    secondSmallest = num;
                }
            }

            return secondSmallest;
        }
    }


