// package CodeBasicsForJOB.Day1-Array;
// https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/
// (nums[i] - nums[j]) * nums[k]

public class ArrEasy03 {
    public static  long maximumValue(int [] arr){
        int n = arr.length;
        long res = 0, maxleft = 0, maxright = 0;
        for (int i = 0; i < n; i++) {
            maxright = Math.max(maxright, maxleft * arr[i]);
            maxleft = Math.max(maxleft, res - arr[i]);
            res = Math.max(res, arr[i]);

        }
        return maxright;
    }
    public static void main(String[] args) {
        int[] nums1 = {12, 6, 1, 2, 7};
        System.out.println(maximumValue(nums1)); // Output: 77

        int[] nums2 = {1, 10, 3, 4, 19};
        System.out.println(maximumValue(nums2)); // Output: 133

        int[] nums3 = {1, 2, 3};
        System.out.println(maximumValue(nums3)); // Output: 0

        int[] nums4 = {1000000, 1, 1000000};
        System.out.println(maximumValue(nums4)); // Output: 999999000000
    }
}
