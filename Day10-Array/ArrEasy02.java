// package Day10-Array;
// 1. Two Sum
// https://leetcode.com/problems/two-sum/description/

public class ArrEasy02 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i + 1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
