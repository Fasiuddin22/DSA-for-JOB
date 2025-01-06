// package CodeBasicsForJOB;
// POSITIVE OR NEGATIVE NUMBERS
public class D1F1{
    public static void main(String[] args) {
        posneg2(-5);
    };
    public static void posneg1(int num){
        if (num == 0){
            System.out.println("Its a zero");
        }
        else if(num > 0){
            System.out.println("Its a positive");
        }
        else{
            System.out.println("Its a negative");
        }
    }

    public static void posneg2(int num){
        String result = num > 0 ? "Its a positive" : "Its a negative";
        System.out.println(result); 
    }
}