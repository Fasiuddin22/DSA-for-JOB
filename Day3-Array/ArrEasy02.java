// package Day3-Array;

public class ArrEasy02 {
     void swap(int [] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    void sortInWave(int [] arr, int n){
        for(int i = 0; i < n; i+=2){
            if(i > 0 && arr[i-1] > arr[i]) 
                swap(arr, i-1, i);
            if(i < n-1 && arr[i+1] > arr[i]) 
                swap(arr, i+1, i);
            
        }
    }
    public static void main(String[] args) {
        ArrEasy02 ae = new ArrEasy02();
        int [] arr = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        ae.sortInWave(arr, n);
        for (int i : arr) {
            System.out.println(i);
            
        }
    }
}
