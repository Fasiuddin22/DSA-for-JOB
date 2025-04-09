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
