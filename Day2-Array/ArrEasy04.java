// Max Consecutive Ones
// https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/3238/

public class ArrEasy04 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}
