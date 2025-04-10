// Squares of a Sorted Array
// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/


import java.util.Arrays;

public class ArrEasy05 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int temp = nums[i] * nums[i];
            nums[i] = temp;
        }
        Arrays.sort(nums);
        return nums;
    }
}
