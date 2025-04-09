// package CodeBasicsForJOB.Day1;
// Q1) Second Largest Element in an Array


class ArrEasy01 {
    public static int getSecondLargest(int [] arr){
        int n = arr.length;
        int secondLargest = -1, largest = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int[] arr1 = {12, 12, 13};
        int[] arr2 = {12, 12, 12};
        System.out.println(getSecondLargest(arr1));
    }
}