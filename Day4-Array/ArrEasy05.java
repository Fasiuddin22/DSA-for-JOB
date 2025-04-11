// package Day4-Array;
// Remove Element
// https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/

public class ArrEasy05 {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
