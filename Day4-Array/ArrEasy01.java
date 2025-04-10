// package Day4-Array;
// Stock Buy and Sell – Max one Transaction Allowed
public class ArrEasy01 {
    public static int maxProfit(int[] arr){
        int minSoFar = arr[0];
        int res = 0;
        for(int i = 1; i < arr.length; i++){
            minSoFar = Math.min(minSoFar, arr[i]);
            res = Math.max(res, arr[i] - minSoFar);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
}
