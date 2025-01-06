// package CodeBasicsForJOB;
// Reverse of a number
public class D1F10 {
    public static void main(String[] args) {
        int num = -1234;
        boolean isNegative = num < 0 ? true: false;

        if (isNegative) {
            System.out.print("-");
            num = num * -1;
        }
        reverse(num);
        
    }
    public static void reverse(int num) {
        if(num == 0){
            return;
        }
        num = Math.abs(num);
        int rem = num % 10;
        System.out.print(rem);
        reverse(num / 10);
    }
}
