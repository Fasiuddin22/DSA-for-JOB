// package Day11.java;
// 1304. Find N Unique Integers Sum up to Zero
// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/

public class ArrEasy01 {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int index = 0;

        for(int i = 1; i <= n/2; i++){
            res[index++] = i;
            res[index++] = -i;
        }
        if(n % 2 != 0){
            res[index] = 0;
        }

        return res;
    }
}
