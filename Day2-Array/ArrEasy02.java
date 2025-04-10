// Move all zeros to end of array
public class ArrEasy02 {
    public static void pushZeroToEnd(int []arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
    

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZeroToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
            
        }
    }

}