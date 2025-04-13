// package Day9-Array;
// 1252. Cells with Odd Values in a Matrix
// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/

public class ArrEasy05 {
    public int oddCells(int m, int n, int[][] indices) {
        int [][] matrix = new int[m][n];
        for (int []index : indices){
            int row = index[0];
            int col = index[1];

            for(int i=0; i < n; i++ ){
                matrix[row][i]++;
            }
            for(int i=0; i < m; i++ ){
                matrix[i][col]++;
            }
        }

        int count = 0;
        for(int []row: matrix){
            for(int cell : row){
                if(cell % 2 == 1){
                    count++;
                }
            }
        }
        return count;
    }
}
