// 1672. Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/description/

public class ArrEasy04 {
    public static int maximumWealth(int[][] accounts) {
        int maxsum = 0;
        for(int row = 0; row < accounts.length; row++) {
            int rowsum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                rowsum += accounts[row][col];
            }
            if(rowsum > maxsum){
                maxsum = rowsum;
            }
        }
        return maxsum;
    }
}