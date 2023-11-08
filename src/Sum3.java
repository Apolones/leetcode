//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.

import java.util.*;

public class Sum3 {
    public static void main(String[] args) {
        int[] sum = new int[]{-2, 0, 1, 1, 2};
        System.out.println(Solution.threeSum(sum));
    }

    class Solution {
        public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> threeSum = new ArrayList<>();
            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 2; i++) {
                if (i != 0 && nums[i] == nums[i - 1]) continue;
                int target = nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    if (nums[left] + nums[right] + nums[i] < 0) left++;
                    else if (nums[left] + nums[right] + nums[i] > 0) right--;
                    else if (nums[left] + nums[right] + nums[i] == 0) {
                        threeSum.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        do left++; while (left < nums.length - 1 && nums[left - 1] == nums[left]);
                        do right--; while (right > 2 && nums[right + 1] == nums[right]);
                    }
                }

            }
            return threeSum;
        }
    }
}
