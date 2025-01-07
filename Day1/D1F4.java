// package CodeBasicsForJOB;
// Sum of the Numbers in a Given Interval
public class D1F4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = 0;
        System.out.println("Sum of n natural number "+ NRangeNumber(a,b,sum));
    }
    public static int NRangeNumber(int a , int b , int sum){
        if( a > b){
            return sum;
        }
        else return a + NRangeNumber(a+1,b,sum);
    }
}
