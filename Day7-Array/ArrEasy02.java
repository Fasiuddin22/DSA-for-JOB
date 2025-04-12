// package Day7-Array;
// 1920. Build Array from Permutation
// https://leetcode.com/problems/build-array-from-permutation/description/

public class ArrEasy02 {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        int k = 0;
        for(int i : nums){
            ans[k++] = nums[i];
        }
        return ans;
    }
}
