package recursion;

public class SumArray {
    /**
     * Recursively calculates the sum of elements in an array.
     *
     * @param arr the array of integers
     * @param n the number of elements to sum, should be the length of the array
     * @return the sum of the first n elements of the array
     * @author Hasini Vijay Inbasri
     */
    public static int sumArray(int[] arr, int n){

        //base case
        if (n == 0){
            return 0;
        } 

        //recursive case
        return arr[n - 1] + sumArray(arr, n - 1);
        
    }

    public static void main(String[] args) {
        System.out.println(sumArray(new int[]{1, 2, 3, 4}, 3));
    }
}
