package interviewPrep;

public class KthSmallestSubstring {

        public static String findSmallestSubstring(String input_str, int k) {
            int n = input_str.length();
            int left = 0, right = 0;
            int countOnes = 0;
            String result = null;

            while (right < n) {
                // Expand the window by moving the right pointer
                if (input_str.charAt(right) == '1') {
                    countOnes++;
                }

                // When we have exactly k '1's, try to shrink the window from the left
                while (countOnes == k) {
                    String candidate = input_str.substring(left, right + 1);
                    if (result == null || candidate.length() < result.length() ||
                            (candidate.length() == result.length() && candidate.compareTo(result) < 0)) {
                        result = candidate;
                    }

                    // Shrink the window by moving the left pointer
                    if (input_str.charAt(left) == '1') {
                        countOnes--;
                    }
                    left++;
                }

                right++;
            }

            return result;
        }

        public static void main(String[] args) {
            String input_str = "010110110101";
            int k = 3;
            System.out.println(findSmallestSubstring(input_str, k)); // Output: "1011"
        }


}
