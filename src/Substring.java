//Given a string s, find the length of the longest substring without repeating characters.

import java.util.HashMap;
import java.util.Map;

public class Substring {
    public static void main(String[] args) {
        String s = "au";
        int maxLength = 0;
        char[] str = s.toCharArray();
        int length = str.length;
        Map<Character, Integer> currentString = new HashMap<>(16, 0.5f);
        int left = 0;
        int right = 0;
        while (right < length) {
            currentString.merge(s.charAt(right), 1, (oldVal, newVal) -> oldVal + newVal);
            if ((right - left + 1) == currentString.size()) {
                maxLength = Math.max(maxLength, (right - left + 1));
            } else while ((right - left + 1) > currentString.size()) {
                if (currentString.get(s.charAt(left)) == 1) currentString.remove(str[left]);
                else currentString.merge(s.charAt(left), 1, (oldVal, newVal) -> oldVal - newVal);
                left++;
            }
            right++;
        }
        System.out.println(maxLength);
    }
}