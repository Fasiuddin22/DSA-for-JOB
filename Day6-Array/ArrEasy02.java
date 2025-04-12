// package Day6-Array;
// Replace Elements with Greatest Element on Right Side
// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/

public class ArrEasy02 {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxsofar = -1;
        for(int i = n-1; i >= 0; i--){
            int current = arr[i];
            arr[i] = maxsofar;
            if(current > maxsofar){
                maxsofar = current;
            }
        }
        return arr;
    }
}
