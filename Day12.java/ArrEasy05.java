// package Day12.java;
// Intersection of Two Arrays II
// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/674/

import java.util.*;
public class ArrEasy05 {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array (optional optimization)
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count elements in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Match elements from nums2
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1); // Decrease count
            }
        }

        // Convert result list to array
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}
