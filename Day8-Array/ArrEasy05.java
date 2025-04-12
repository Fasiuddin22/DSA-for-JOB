// package Day8-Array;
// 1886. Determine Whether Matrix Can Be Obtained By Rotation
// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/

public class ArrEasy05 {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++){
            if(isEqual(mat,target)) return true;
            mat = rotate(mat);
        }
        return false;
    }

    private boolean isEqual(int[][] mat, int [][] target){
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = 0;j < n; j++){
                if(mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }

    private int[][] rotate(int [][] mat){
        int n = mat.length;
        int [][] rotate = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                rotate[j][n - i - 1] = mat[i][j];
            }
        }
        return rotate;
    }
}
