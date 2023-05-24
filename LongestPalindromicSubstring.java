package RFP283.Rough;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() <= 2) {
            return s;
        }

        int start = 0;
        int maxLength = 1;
        String ans = "";

        boolean[][] dp = new boolean[s.length()][s.length()];

//        // Initialize single character palindromes
//        for (int i = 0; i < s.length(); i++) {
//            dp[i][i] = true;
//        }

        // Check for palindromes of length 2
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for palindromes of length greater than 2
        for (int len = 3; len <= s.length(); len++) {
            for (int i = 0; i <= s.length() - len; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;

                    if (len > maxLength) {
                        maxLength = len;
                        start = i;
                    }
                }
            }
        }

        if (s.substring(start, start + maxLength).length() <= 2) {
            ans = "none";
        } else {
            ans = s.substring(start, start + maxLength);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String longestPalindrome = longestPalindrome(input);
        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }
}

