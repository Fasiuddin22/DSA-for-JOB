// package Day11.java;
// 1380. Lucky Numbers in a Matrix
// https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/

import java.util.*;
public class ArrEasy02 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            int minVal = matrix[i][0];
            int minColIndex = 0;

            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    minColIndex = j;
                }
            }

            boolean isMaxInCol = true;
            for(int k = 0; k < matrix.length; k++){
                if(matrix[k][minColIndex] > minVal) {
                    isMaxInCol = false;
                    break;
                }
            }

            if(isMaxInCol) {
                result.add(minVal);
            }
        }
        return result;
    }
}
