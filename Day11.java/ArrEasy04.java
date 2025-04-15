// package Day11.java;
// 566. Reshape the Matrix
// https://leetcode.com/problems/reshape-the-matrix/description/

public class ArrEasy04 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(n * m != r * c) return mat;
        int [][] reshaped = new int[r][c];
        int row = 0, col = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                reshaped[row][col] = mat[i][j];
                col++;

                if(col == c){
                    col = 0;
                    row++;
                }
            }
        }
        return reshaped;
    }
}
