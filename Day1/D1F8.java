// package CodeBasicsForJOB;
// Prime number in a range

public class D1F8 {
    
    public static void main(String[] args) {
        int lower = 1;
        int higher = 21;
        for (int i = lower; i < higher; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean  isPrime(int n) {
        // boolean isPrime = true;
        if(n <= 1){
            return  false;
        }
        else if(n == 2){
            return  true;
        }
        else if (n % 2 == 0){
            return  false;
        }
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            if(n % i == 0){
                return  false;
            }
        }
        return  true;
    }
}


