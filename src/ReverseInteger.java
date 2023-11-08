//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

public class ReverseInteger {
    public static void main(String[] args) {
        int n = 1534236469;
        System.out.println(Solution.reverse(n));
    }

    class Solution {
        public static int reverse(int x) {
            int revers = 0;
            while (x != 0) {
                if (revers > Integer.MAX_VALUE / 10 || revers < Integer.MIN_VALUE / 10) return 0;
                revers = revers * 10 + x % 10;
                x = x / 10;
            }
            return revers;
        }
    }
}
