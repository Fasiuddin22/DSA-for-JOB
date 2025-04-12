// package Day7-Array;
// 1470. Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/description/

public class ArrEasy03 {
    public int[] shuffle(int[] nums, int n) {
        int [] res = new int[nums.length];
        for(int i = 0; i < n; i++){
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[i+n];
        }
        return res;
    }
}
