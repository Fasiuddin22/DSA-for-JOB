// package Day6-Array;
// Sort Array By Parity
// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/

public class ArrEasy03 {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int []res = new int[n];
        int index = 0;
        for(int num: nums){
            if(num % 2 == 0){
                res[index++] = num;
            }
        }
        for(int num: nums){
            if(num % 2 != 0){
                res[index++] = num;
            }
        }
        return res;
        
    }
}
