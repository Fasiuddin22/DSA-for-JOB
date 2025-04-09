// package CodeBasicsForJOB.Day2-Array;
// Maximum consecutive one’s (or zeros) in a binary array

public class ArrEasy01 {
    public static int maxConsecutive(int []arr){
        int n = arr.length;
        int maxCount = 0 , count = 1;
        if(n == 1){
            return 0;
        }
        for (int i = 1; i < n; i++) {
            if(arr[i] == arr[i-1]){
                count++;
            }
            else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
            
        }
        return Math.max(maxCount, count);
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 0,0,0,0,0, 1, 0, 1, 0, 1, 1, 1, 1};
        int arr1[] = {0};

        System.out.println(maxConsecutive(arr1));
    }
}
