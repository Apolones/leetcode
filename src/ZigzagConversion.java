//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
// (you may want to display this pattern in a fixed font for better legibility)
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//
//Write the code that will take a string and make this conversion given a number of rows:
//
//string convert(string s, int numRows);

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "AB";
        System.out.println(Solution.convert(s, 1));
    }

    class Solution {
        public static String convert(String s, int numRows) {
            char[] str = s.toCharArray();
            List<LinkedList<Character>> stroke = new ArrayList<>();
            for (int i = 0; i < numRows; i++) stroke.add(new LinkedList<Character>());
            int k = 0;
            int direction = 1;
            for (int i = 0; i < s.length(); i++) {
                stroke.get(k).add(str[i]);
                if (k == (numRows - 1) && k == 0) {
                    direction = 0;
                } else if (k == (numRows - 1)) {
                    direction = -1;
                } else if (k == 0) {
                    direction = 1;
                }
                k += direction;
            }
            String result = "";
            for (int i = 0; i < numRows; i++)
                while (!stroke.get(i).isEmpty()) {
                    result += stroke.get(i).get(0);
                    stroke.get(i).remove(0);
                }
            return result;
        }
    }
}
