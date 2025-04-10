
import java.util.Arrays;

// package Day5-Array;
// Insert an adjacent duplicate for all occurrences of a given element
public class ArrEasy01 {
    public static int[] duplicatek(int []arr, int k){
        int n = arr.length;
        int cnt = count(arr,k);
        int write_idx = n + cnt - 1;
        int curr = n - 1;
        while(curr >= 0 && write_idx >= 0){
            if(write_idx < n)
                arr[write_idx] = arr[curr];
            write_idx -= 1;
            if(arr[curr] == k){
                if(write_idx < n)
                    arr[write_idx] = k;
                write_idx -= 1;
                    
            }
            --curr;
        }
        return arr;
    }
    public static int count(int []arr, int k){
        int ans = 0;
        for(int i : arr){
            if(i == k){
                ans++;
            }
        }
        return ans;

    }


    public static int[] duplicatek2(int [] arr,int k ){
        int n = arr.length;
        int []result = new int[n*2];
        int index = 0;
        for(int i = 0; i < n; i++){
            result[index++] = arr[i];
            if(arr[i] == k)
                result[index++] = k;
        }
        return Arrays.copyOf(result, n);
    }
    public static void main(String[] args)
    {
        int []arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        int k=0;
        int []ans = duplicatek2(arr,k);

        for(int i = 0; i < ans.length; i++)
        System.out.print(ans[i] + " ");
    }
}
