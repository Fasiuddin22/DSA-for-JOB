// package CodeBasicsForJOB;
// SUM OF DIGITS
public class D1F9 {
    public static void main(String[] args) {
        int n = 12345;
        int res = SumOfDigits(n);

        String num = "12345";
        int res1 = SumOfDigits2(num);
        System.out.println("The sum is = " + res1);
    }
    public static int SumOfDigits(int num) {
        if(num == 0){
            return 0;
        }
        return (num % 10) + SumOfDigits(num/10);
    }
    public static int SumOfDigits2(String num) {
        int sum = 0;
        
            for (int i = 0; i < num.length(); i++) {
                sum = sum + num.charAt(i) - 48;
            }
        return sum;
    }
    
}
