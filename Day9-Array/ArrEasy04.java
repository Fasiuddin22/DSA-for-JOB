// package Day9-Array;
// 1572. Matrix Diagonal Sum
// https://leetcode.com/problems/matrix-diagonal-sum/description/


public class ArrEasy04 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }

        if(n % 2 == 1){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}
