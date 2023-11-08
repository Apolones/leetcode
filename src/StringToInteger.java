//Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
//
//The algorithm for myAtoi(string s) is as follows:
//
//Read in and ignore any leading whitespace.
//Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
//Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
//Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
//If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
//Return the integer as the final result.
//Note:
//
//Only the space character ' ' is considered a whitespace character.
//Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.

public class StringToInteger {
    public static void main(String[] args) {
        String s = "2147483648";
        System.out.println(Solution.myAtoi(s));
    }

    class Solution {
        public static int myAtoi(String s) {
            if (s.length() == 0) return 0;
            char[] str = s.toCharArray();
            boolean negative = false;
            int ascii = str[0];
            long result = 0;
            int i = 0;
            while (ascii == 32 && i < (str.length - 1)) {
                i++;
                ascii = str[i];
            }
            if (ascii == 45) {
                negative = true;
                i++;
            } else if (ascii == 43) i++;
            while (i < str.length) {
                ascii = str[i];
                switch (ascii) {
                    case (48):
                        result = result * 10 + 0;
                        break;
                    case (49):
                        result = result * 10 + 1;
                        break;
                    case (50):
                        result = result * 10 + 2;
                        break;
                    case (51):
                        result = result * 10 + 3;
                        break;
                    case (52):
                        result = result * 10 + 4;
                        break;
                    case (53):
                        result = result * 10 + 5;
                        break;
                    case (54):
                        result = result * 10 + 6;
                        break;
                    case (55):
                        result = result * 10 + 7;
                        break;
                    case (56):
                        result = result * 10 + 8;
                        break;
                    case (57):
                        result = result * 10 + 9;
                        break;
                    default:
                        i = str.length;
                }
                if (result > Integer.MAX_VALUE && !negative) return Integer.MAX_VALUE;
                if (-result < Integer.MIN_VALUE && negative) return Integer.MIN_VALUE;
                i++;
            }
            if (negative) result = -result;
            return (int) result;
        }
    }
}
