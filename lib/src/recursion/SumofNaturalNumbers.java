package recursion;

public class SumofNaturalNumbers {
    /**
     * Computes the sum of the first N natural numbers.
     *
     * @param n the number up to which the sum is calculated
     * @return the sum of the first N natural numbers
     * @author Hasini Vijay Inbasri
     */
    public static int sum(int n) {
        //base case
        if (n == 1) {
            return 1;
        }

        //recursive case
        return n + sum(n - 1); 
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
    }
}

