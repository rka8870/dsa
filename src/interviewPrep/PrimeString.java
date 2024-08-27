package interviewPrep;

import java.util.HashMap;
import java.util.Map;

public class PrimeString {

    private static final int MOD = 1000000007;
    private static Map<String, Integer> memo = new HashMap<>();

    public static int countPrimeStrings(String s) {
        return countPrimeStringsHelper(s);
    }


    public static void main(String[] args) {
        String s = "3175";
        System.out.println(countPrimeStrings(s));
    }

    private static int countPrimeStringsHelper(String s) {
        if (s.isEmpty()) {
            return 1;
        }
        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        int count = 0;
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (isPrime(prefix)) {
                count = (count + countPrimeStringsHelper(s.substring(i))) % MOD;
            }
        }

        memo.put(s, count);
        return count;
    }

    private static boolean isPrime(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') {
            return false;
        }
        int num = Integer.parseInt(s);
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
