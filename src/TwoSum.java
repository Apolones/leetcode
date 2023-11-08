//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 7, 11, 15};
        int target = 8;
        int[] answer = Solution.twoSum(nums, target);
        System.out.println(Arrays.toString(answer));
    }

    class Solution {
        public static int[] twoSum(int[] nums, int target) {
            int size = nums.length;
            int diff;
            Map<Integer, Integer> num = new HashMap<>();
            for (int i = 0; i < size; i++) {
                diff = target - nums[i];
                if (num.containsKey(diff) && num.get(diff) != i) return new int[]{num.get(diff), i};
                num.put(nums[i], i);
            }
            return new int[]{};
        }
    }
}