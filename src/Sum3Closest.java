//Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
//
//Return the sum of the three integers.
//
//You may assume that each input would have exactly one solution.

import java.util.*;

public class Sum3Closest {
    public static void main(String[] args) {
        int[] sum = new int[]{0, 1, 2, 5};
        System.out.println(Solution.threeSumClosest(sum, 10));
    }

    class Solution {
        public static int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int closest = Integer.MAX_VALUE;

            for (int i = 0; i < nums.length - 2; i++) {
                if (i != 0 && nums[i] == nums[i - 1]) continue;
                int left = i + 1;
                int sum;
                int right = nums.length - 1;
                while (left < right) {
                    sum = nums[left] + nums[right] + nums[i];

                    if (sum - target < 0) {
                        if (target - sum < Math.abs(target - closest)) closest = sum;
                        left++;
                    } else if (sum - target > 0) {
                        if (sum - target < Math.abs(target - closest)) closest = sum;
                        right--;
                    } else if (sum - target == 0) {
                        return target;
                    }
                }
            }
            return closest;
        }
    }
}
