package recursion;

public class PowerFunction {
    /**
     * Computes the power of a base number using recursion.
     *
     * @param base The base number to be raised to the power.
     * @param exponent The exponent that determines how many times the base is multiplied.
     * @return The result of base raised to the given exponent.
     * @author Hasini Vijay Inbasri
     */
    public static int power(int base, int exponent) {
        //base case
        if (exponent == 0) {
            return 1;
        }

        //recursion case
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3)); 
    }
}

