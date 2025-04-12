// package Day8-Array;

// 1389. Create Target Array in the Given Order
// https://leetcode.com/problems/create-target-array-in-the-given-order/description/

import java.util.*;
public class ArrEasy04 {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);  // insert at the specified index
        }

        // Convert list to array
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = target.get(i);
        }

        return result;
    }
}
