// package Day3-Array;
// Adding one to number represented as array of digits
public class ArrEasy03 {
    static int[] addone (int [] arr) {
        int n = arr.length;
        int count = 1;
        for(int i = n - 1; i >= 0 ; i--){
            int sum = arr[i] + count;
            arr[i] = sum % 10;
            count = sum / 10;
        }
        if(count > 0){
            int [] newarr = new int[arr.length + 1];
            newarr[0] = count;
            System.arraycopy(arr,0,newarr,1,n);
            return newarr;

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        int[] res = addone(arr);
        for(int i : res) {
            System.out.print(i);
        }
    }
}
