// package CodeBasicsForJOB.Day1;/
// Third largest element in an array of distinct elements

public class ArrEasy02 {
    public static int getThirdElement(int []arr) {
        int n = arr.length;
        
        int first = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first){
                first = arr[i];
            }
        }
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > second && arr[i] < first ){
                second = arr[i];
            }
        }
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > third && arr[i] < second){
                third = arr[i];
            }
        }
        return third;  
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int[] arr1 = {12, 12, 13};
        int[] arr2 = {1,2};
        System.out.println(getThirdElement(arr2));
    }
}
