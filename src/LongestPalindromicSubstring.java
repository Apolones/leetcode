//Given a string s, return the longest palindromic substring in s.

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "aa";
        System.out.println(Solution.longestPalindrome(s));
    }

    class Solution {
        public static String maxPalindrome(String s, int middle, int offset) {
            int max = Math.min(s.length() - (middle + offset), middle + 1);
            String palindrome = "";
            for (int range = 0; range < max; range++)
                if (s.charAt(middle + offset + range) == s.charAt(middle - range)) {
                    if (2 * range + 1 + offset > palindrome.length())
                        palindrome = s.substring(middle - range, middle + range + 1 + offset);
                } else break;
            return palindrome;
        }

        public static String longestPalindrome(String s) {
            String palindrome = "";
            for (int middle = 0; middle < s.length(); middle++) {
                if (palindrome.length() < maxPalindrome(s, middle, 0).length())
                    palindrome = maxPalindrome(s, middle, 0);
                if (palindrome.length() < maxPalindrome(s, middle, 1).length())
                    palindrome = maxPalindrome(s, middle, 1);
            }
            return palindrome;
        }
    }
}
