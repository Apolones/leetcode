//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//The overall run time complexity should be O(log (m+n)).

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{3};
        double answer;
        answer = Solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(answer);
    }

    class Solution {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int lengthNums1 = nums1.length;
            int lengthNums2 = nums2.length;
            double median;
            int mergeLength = lengthNums1 + lengthNums2;
            int[] mergeArray = new int[mergeLength];
            int i = 0;
            int j = 0;
            while (i < lengthNums1 && j < lengthNums2) {
                if (nums1[i] <= nums2[j]) {
                    mergeArray[i + j] = nums1[i];
                    i++;
                } else {
                    mergeArray[i + j] = nums2[j];
                    j++;
                }
            }
            while (i < lengthNums1) {
                mergeArray[i + j] = nums1[i];
                i++;
            }
            while (j < lengthNums2) {
                mergeArray[i + j] = nums2[j];
                j++;
            }
            if (mergeLength % 2 == 0) median = (mergeArray[mergeLength / 2 - 1] + mergeArray[mergeLength / 2]) / 2d;
            else median = mergeArray[mergeLength / 2];
            return median;
        }
    }
}
