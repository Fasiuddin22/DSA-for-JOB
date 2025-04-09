// package CodeBasicsForJOB;
// Prime number
public class D1F7 {
    public static void main(String[] args) {
        Prime(21);
    }

    public static void Prime(int n) {
        boolean isPrime = true;
        if(n <= 1){
            isPrime = false;
        }
        else if(n == 2){
            isPrime = true;
        }
        else if (n % 2 == 0){
            isPrime = false;
        }
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            if(n % i == 0){
                isPrime = false;
                break;
            }
            isPrime = true;
        }

        String result = isPrime ? "PRIME" : "NOT PRIME";
        System.out.print("The number " +n+" is a "+ result);
        
    }
}
