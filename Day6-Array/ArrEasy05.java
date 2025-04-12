// package Day6-Array;
// Height Checker
// https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3228/

import java.util.*;
public class ArrEasy05 {
    public int heightChecker(int[] heights) {
        int []expected = Arrays.copyOf(heights,heights.length);
        Arrays.sort(expected);
        int count = 0;
        
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
}
