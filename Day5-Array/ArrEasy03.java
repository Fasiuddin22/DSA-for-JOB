// package Day5-Array;
import java.util.*;
public class ArrEasy03 {
    public static ArrayList<Integer> findTwoElement (int []arr){
        int n = arr.length;
        int []freq = new int[n + 1];
        int repeating = -1;
        int missing = -1;
        for(int i = 0; i < n; i++){
            freq[arr[i]]++;
        }
        for(int i = 1; i <= n; i++){
            if(freq[i] == 0)  {
                missing = i;
            }
            else if(freq[i] == 2){
                repeating = i; 
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        
        return result;
    }


    public static ArrayList<Integer> findTwoElement2(int []arr){
        int n = arr.length;
        int repeating = -1;
        for(int i = 0; i < n; i++){
            int val = Math.abs(arr[i]);
            if(arr[val - 1] > 0){
                arr[val - 1] = -arr[val - 1];
            }
            else{
                repeating = val;
            }
        }

        int missing = -1;
        for (int i = 0; i < n; i++){
            if(arr[i] > 0){
                missing = i + 1;
                break;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        
        return result;
    }


    public static ArrayList<Integer> findTwoElement3(int [] arr){
        int n = arr.length;
        int s = (n * (n + 1)) / 2 ;
        int ssq = (n * (n + 1) * (2 * n + 1)) / 6;
        int missing = 0, repeating = 0;
        for(int i = 0; i < n; i++){
            s -= arr[i];
            ssq -= arr[i] * arr[i];

        }

        missing = (s + ssq / s) / 2 ;
        repeating = missing - s;

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        
        return result;
    }
    

    public static void main(String[] args) {
        int[] arr = {3, 1, 3};
        ArrayList<Integer> ans = findTwoElement3(arr);
        
        System.out.println(ans.get(0) + " " + ans.get(1));
    }
}
