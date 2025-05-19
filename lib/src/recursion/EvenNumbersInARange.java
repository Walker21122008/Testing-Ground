package recursion;

public class EvenNumbersInARange {

    /**
     * Prints all even numbers between the specified start and end values inclusively.
     *
     * @param start The starting integer value.
     * @param end   The ending integer value.
     * @author Hasini Vijay Inbasri
     */
    public static void printEvens(int start, int end) {
        //base case
        if(start > end){
            return;
        }
        if(start % 2 == 0){
            System.out.print(start + " ");
        }

        //recursion case
        printEvens(start + 1, end);
    }

    public static void main(String[] args) {
        printEvens(10, 12);
    }
}

