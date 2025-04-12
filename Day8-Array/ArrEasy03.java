// package Day8-Array;
// 1512. Number of Good Pairs.
// https://leetcode.com/problems/number-of-good-pairs/description/

public class ArrEasy03 {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if((nums[i] == nums[j]) && (i < j) ){
                    count++;
                }
            }
        }
        return count;
    }
}
