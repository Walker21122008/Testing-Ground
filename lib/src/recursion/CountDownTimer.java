package recursion;

public class CountDownTimer {

    /**
     * Prints a countdown from the given number to 1.
     *
     * @param n the starting number of the countdown
     * @author Hasini Vijay Inbasri
     */
    public static void countDown(int n) {

        //base case
        if(n < 1){
            return;
        }
        System.out.print(n + " ");
        countDown(n - 1);
    }

    public static void main(String[] args) {
        countDown(5); // Output: 5 4 3 2 1
    }
}