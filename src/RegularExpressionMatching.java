//Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
//
//'.' Matches any single character.
//'*' Matches zero or more of the preceding element.
//The matching should cover the entire input string (not partial).

public class RegularExpressionMatching {
    public static void main(String[] args) {
        String s = "mississippi";
        String p = "mis*is*ip*.";
        System.out.println(Solution.isMatch(s, p));
    }

    class Solution {

        public static boolean isMatch(String s, String p) {
            boolean dp[][] = new boolean[s.length() + 1][p.length() + 1];
            dp[0][0] = true;
            for (int j = 2; j < p.length() + 1; j++)
                dp[0][j] = p.charAt(j - 1) == '*' && dp[0][j - 2];
            for (int j = 1; j < p.length() + 1; j++)
                for (int i = 1; i < s.length() + 1; i++) {
                    if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') dp[i][j] = dp[i - 1][j - 1];
                    else if (p.charAt(j - 1) == '*')
                        dp[i][j] = (((s.charAt(i - 1) == p.charAt(j - 2)) || (p.charAt(j - 2) == '.')) && dp[i - 1][j]) || dp[i][j - 2];
                }
            return dp[s.length()][p.length()];
        }
    }
}