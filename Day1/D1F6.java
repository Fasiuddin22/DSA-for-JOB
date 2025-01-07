// package CodeBasicsForJOB;
// Leap year
public class D1F6 {
    public static void main(String[] args) {
        LeapYear(2025);
    }
    public static void LeapYear(int num) {
        int result = (num % 400 == 0) || (num % 4 == 0 && num % 100 != 0 ) ? 1 : 0;
        if (result == 1){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("NOT A LEAP YEAR");
        }
    }
}
