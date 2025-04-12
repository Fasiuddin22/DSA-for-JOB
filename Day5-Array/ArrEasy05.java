// package Day5-Array;
// Check If N and Its Double Exist
// https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
import java.util.HashSet;
public class ArrEasy05 {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkIfExist2(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(2 * num) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
