package recursion;

public class SumDigits {
    /**
     * Calculates the sum of the digits of a given integer recursively.
     *
     * @param n the integer whose digits will be summed
     * @return the sum of the digits of n
     * @author Hasini Vijay Inbasri
     */
    public static int sumOfDigits(int n){
        //base case
        if (n == 0) {
            return 0;
        }

        //recursive case
        return n % 10 + sumOfDigits(n / 10);
    }
    
    public static void main(String[] args) {
        System.out.println(sumOfDigits(34));
    }
}
