// package CodeBasicsForJOB.Day1-Array;
// Maximum product of a triplet
public class ArrEasy04 {
    public static int MaximumProduct(int []arr){
        int n = arr.length;
        int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;
        int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > maxA){
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            }
            else if(arr[i] > maxB){
                maxC = maxB;
                maxB = arr[i];
            }
            else if(arr[i] > maxC){
                maxB = arr[i];
            }


            if(arr[i] < minA){
                minB = minA;
                minA = arr[i];
            }
            else if(arr[i] < minB){
                minB = arr[i];
            }
        }

        return Math.max(minA*minB*maxA, maxA*maxB*maxC);


    }

    public static void main(String[] args) {
        int[] arr = {-10, -3, 5, 6, -20};
        System.out.println(MaximumProduct(arr));
    }
}
