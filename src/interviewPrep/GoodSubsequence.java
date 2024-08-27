package interviewPrep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GoodSubsequence {
        public static void main(String[] args) {
            int[] arr = {13, 11, 4, 5, 4,12};
            Arrays.sort(arr);

            Map<Integer, Integer> count = new HashMap<>();
            for (int num : arr) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }

            int max = Arrays.stream(arr).max().getAsInt();
            int[] dp = new int[max + 1];

            for (int i : arr) {
                if (count.containsKey(i)) {
                    dp[i] = count.get(i) * (i > 0 ? dp[i - 1] : 0) + count.get(i);
                }
            }

            int sum = 0;
            for (int value : dp) {
                sum += value;
            }

            System.out.println(sum);
        }
    }
