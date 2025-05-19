package recursion;

public class DecimalToBinary {

    /**
     * Converts a given integer to its binary representation using recursion.
     *
     * @param n the integer to convert
     * @return the binary string representation of the integer
     * @author Hasini Vijay Inbasri
     */
    public static String toBinary(int n) {

        //base cases
        if (n == 0){
            return "0"; 
        } 

        if (n == 1){
            return "1"; 
        }

        //recursion case
        return toBinary(n / 2) + (n % 2); 
    }

    public static void main(String[] args) {
        System.out.println(toBinary(10)); 
    }
}


