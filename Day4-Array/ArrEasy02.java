// package Day4-Array; // Not array
// Finding sum of digits of a number until sum becomes single digit
public class ArrEasy02 {
    public static int singleDigit(int n){
        int sum = 0;
        while(n > 0 || sum > 9){
            if(n == 0){
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static int singleDigit2(int n){
        if(n == 0)
            return 0;
        if(n % 9 == 0)
            return 9;
        return (n%9);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(singleDigit2(n));
    }
}
