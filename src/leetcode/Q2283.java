package leetcode;

import java.util.HashMap;

public class Q2283 {
    public static void main(String[] args) {
        String  num = "1210";
        System.out.println(digitCount(num));
    }

    private static boolean digitCount(String num) {
        int[] count = new int[10];

        // Count frequency of each digit
        for (char ch : num.toCharArray()) {
            count[ch - '0']++;
        }

        // Check if count[i] matches num[i]
        for (int i = 0; i < num.length(); i++) {
            int expectedCount = num.charAt(i) - '0';
            if (count[i] != expectedCount) {
                return false;
            }
        }
        return true;
    }
}
