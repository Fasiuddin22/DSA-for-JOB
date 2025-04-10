// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
// Find Numbers with Even Number of Digits

public class ArrEasy05 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(isEvenDigit(num)){
                count++;
            }
        }
        return count;
    }

    static boolean isEvenDigit(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num){
        return (int)Math.log10(num) + 1;
    }
}
