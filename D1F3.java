// package CodeBasicsForJOB;
// Sum of all N Natural Number
public class D1F3 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Sum of n natural number "+ NNumber(num));
    }
    public static int NNumber(int n){
        if(n == 0){
            return 0;
        }
        else return n + NNumber(n-1);
    }
}
