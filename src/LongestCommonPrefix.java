//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(Solution.longestCommonPrefix(strs));
    }

    class Solution {
        public static String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            String maxPrefix = "";
            for (int i = 0; i < strs[0].length(); i++) {
                if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) maxPrefix += strs[0].charAt(i);
                else break;
            }
            return maxPrefix;
        }
    }
}
