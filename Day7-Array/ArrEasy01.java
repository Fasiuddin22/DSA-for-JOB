// package Day7-Array;
//  Third Maximum Number
// https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3231/

public class ArrEasy01 {
    public int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;

        for (int num : nums) {
            long n = (long) num; // Avoid overflow for Integer.MIN_VALUE

            if ((first != null && n == first) || 
                (second != null && n == second) || 
                (third != null && n == third)) {
                continue; // Skip duplicates
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } else if (second == null || n > second) {
                third = second;
                second = n;
            } else if (third == null || n > third) {
                third = n;
            }
        }

        return third != null ? third.intValue() : first.intValue();
    }
}
