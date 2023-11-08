//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println(Solution.strStr("", "234"));

    }

    class Solution {
        public static int strStr(String haystack, String needle) {
            if (needle.isEmpty()) return 0;
            int left = 0;
            int right = 0;
            char[] haystackChar = haystack.toCharArray();
            char[] needleChar = needle.toCharArray();
            while (right < haystack.length()) {
                if (haystackChar[right] == needleChar[right - left]) right++;
                else {
                    left++;
                    right = left;
                }
                if (right - left == needleChar.length) return left;
            }
            return -1;

        }
    }
}
