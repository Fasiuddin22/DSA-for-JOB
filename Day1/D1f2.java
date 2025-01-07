// package CodeBasicsForJOB;
// Even or Odd
public class D1f2 {
    public static void main(String[] args) {
        int num = 45;
        String logic = EvenOrOdd(num) ? "even" : "odd"; 
        System.out.println("the num is " + logic );
    }

    public static boolean  EvenOrOdd(int num){
        if(num%2 == 0)
            return true;
        else
            return false;
    }
}


