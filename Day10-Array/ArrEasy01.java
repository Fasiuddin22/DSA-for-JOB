// package Day10-Array;
// 832. Flipping an Image
// https://leetcode.com/problems/flipping-an-image/description/
public class ArrEasy01 {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            while (left <= right) {
                // Flip and invert at the same time
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;

                left++;
                right--;
            }
        }

        return image;
    }
}
