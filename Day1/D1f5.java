// package CodeBasicsForJOB;
// Greatest and Smallest of 3 numbers
public class D1f5 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 2;
        int []res = GratestSmallest(a, b, c);
        System.out.println("Maximum = " + res[0] + " Minimum = " + res[1]);
    }
    public static int[]  GratestSmallest(int a, int b, int c){
        int max = Math.max(c, (Math.max(a, b))) ;
        int min = Math.min(c, (Math.max(a, b)));
        int[] result = new int[2];
        result[0] = max;
        result[1] = min;
        return result;
    }
}
