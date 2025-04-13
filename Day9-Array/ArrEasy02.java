// package Day9-Array;
// 989. Add to Array-Form of Integer
// https://leetcode.com/problems/add-to-array-form-of-integer/description/

import java.util.*;
public class ArrEasy02 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int i = num.length - 1;
        int carry = 0;
        while(i >= 0 || k > 0){
            int digitSum = i >= 0 ? num[i] : 0;
            int digitK = k % 10;
            int sum = digitSum + digitK + carry;
            res.add(sum % 10);
            carry = sum / 10;
            k /= 10;
            i--;
        }
        if(carry != 0){
            res.add(carry);
        }
        Collections.reverse(res);
        return res;
    }
}
