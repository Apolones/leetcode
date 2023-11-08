//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(Solution.generateParenthesis(3));

    }

    class Solution {
        public static List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList<>();
            add(result, "", n, 0, 0);
            return result;
        }

        public static void add(List<String> result, String current, int n, int left, int right) {
            if (current.length() == n * 2 && left == right)
                result.add(current);
            if (left < n) add(result, current + "(", n, left + 1, right);
            if (right < left) add(result, current + ")", n, left, right + 1);
        }
    }
}
