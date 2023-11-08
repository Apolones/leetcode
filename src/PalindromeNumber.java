//Given an integer x, return true if x is a palindrome, and false otherwise.

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 1210;
        System.out.println(Solution.isPalindrome(x));
    }

    class Solution {
        public static boolean isPalindrome(int x) {
            if (x < 0 || (x % 10 == 0 && x != 0)) return false;
            int revers = 0;
            while (x > revers) {
                revers = revers * 10 + x % 10;
                x = x / 10;
            }
            if (x == revers || x == revers / 10) return true;
            else return false;
        }
    }
}
