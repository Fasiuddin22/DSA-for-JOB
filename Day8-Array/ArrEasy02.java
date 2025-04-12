// package Day8-Array;
// 1365. How Many Numbers Are Smaller Than the Current Number
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

public class ArrEasy02 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int res [] = new int [n];
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(nums[j] < nums[i])
                    count++;
            }
            res[i] = count;
        }
        return res;
    }
}
