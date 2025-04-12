// package Day6-Array;
// Find All Numbers Disappeared in an Array
// https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/

import java.util.*;
public class ArrEasy04 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        cycleSort(nums);
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != i+1){
                    ans.add(i+1);
                }
            }
            return ans;
    }


    static void cycleSort(int []arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int []arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
