// Missing ranges of numbers
import java.util.*;
class ArrEasy04 {
    public static List<List<Integer>> missingRange(int [] arr, int low, int high){
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;
        if(low < arr[0]){
            res.add(Arrays.asList(low,arr[0] - 1));
        }
        for(int i = 0; i < n - 1; i++) {
            if(arr[i+1] - arr[i] > 1){
                res.add(Arrays.asList(arr[i] + 1, arr[i+1]));
            }
        }
        if(high > arr[n-1]){
            res.add(Arrays.asList(arr[n-1] + 1, high));
        }

        return res;

    }

    public static void main(String[] args) {
        int lower = 10;
        int upper = 50;
        int[] arr = {14, 15, 20, 30, 31, 45};
        List<List<Integer>> res = missingRange(arr, lower, upper);
        for (List<Integer> range : res) {
            System.out.println(range.get(0) + " " + range.get(1));
        }
    }
}