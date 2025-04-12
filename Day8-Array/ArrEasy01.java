// package Day8-Array;
// 1929. Concatenation of Array
// https://leetcode.com/problems/concatenation-of-array/description/
public class ArrEasy01 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];       // First copy
            ans[i + n] = nums[i];   // Second copy
        }
        
        return ans;
    }
}
