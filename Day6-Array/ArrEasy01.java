// package Day6-Array;
// Valid Mountain Array
// https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/

public class ArrEasy01 {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n < 3) return false;
        int i = 0;
        while((i+1 < n) && arr[i] < arr[i+1]){
            i++;
        }
        if(i == 0 || i == n-1){
            return false;
        }
        while((i+1 < n) && arr[i] > arr[i+1]){
            i++;
        }
        return i == n-1;
    }
}
