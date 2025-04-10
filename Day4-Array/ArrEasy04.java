// package Day4-Array;
// Remove Duplicates from Sorted Array
// https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
public class ArrEasy04 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 1){
            return n;
        }
        int idx = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] != nums[i-1]) {
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
}
