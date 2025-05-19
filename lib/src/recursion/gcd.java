package recursion;

public class gcd {
    public static int gcd(int a, int b){
        /*
         * Step 1: Start with the two numbers, say 'a' and 'b'.
            Step 2: If 'b' is 0, then the GCD is 'a'. Otherwise, continue to the next step.
            Step 3: Calculate the remainder when 'a' is divided by 'b' (a % b).
            Step 4: Replace 'a' with 'b' and 'b' with the remainder calculated in the previous step.
            Step 5: Repeat steps 2-4 until 'b' becomes 0. The final value of 'a' is the GCD. 
         */
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);

    }

    public static void main(String[] args) {
        System.out.println(gcd(16, 40)); 
    }
}
