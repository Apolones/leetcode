//

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "]";
        System.out.println(Solution.isValid(s));
    }

    class Solution {
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char x : s.toCharArray()) {
                if (x == '(')
                    stack.push(')');
                else if (x == '[')
                    stack.push(']');
                else if (x == '{')
                    stack.push('}');
                else if (stack.isEmpty() || x != stack.pop())
                    return false;
            }
            return stack.isEmpty();
        }
    }
}
