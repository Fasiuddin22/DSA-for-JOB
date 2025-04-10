// package Day3-Array;
// Duplicate Zeros
// https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/

public class ArrEasy04 {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int possibleDups = 0;

        // Step 1: Count the number of zeros that can be duplicated
        for (int i = 0; i + possibleDups < n; i++) {
            if (arr[i] == 0) {
                // If adding a duplicate 0 exceeds the array, we break early
                if (i + possibleDups == n - 1) {
                    arr[n - 1] = 0; // Handle the edge zero
                    n = n - 1; // Ignore the last element now
                    break;
                }
                possibleDups++;
            }
        }

        // Step 2: Work backwards and do the duplication
        int last = n - 1 - possibleDups;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}
