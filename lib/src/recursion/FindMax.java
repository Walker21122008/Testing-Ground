package recursion;

public class FindMax {
    /**
     * Recursively finds the maximum value in an array.
     *
     * @param arr The array of integers to search.
     * @param n The number of elements to consider in the array.
     * @return The maximum integer found in the first n elements of the array.
     * @author Hasini Vijay Inbasri
     */

    public static int findMax(int[] arr, int n){

        //base case
        if(n == 1){
            return arr[n-1];
        }
        
        //recursive case
        int max = findMax(arr, n-1);

        if (max > arr[n-1]){
            return max;
        }
        else{
            return arr[n-1];
        }
         
    }
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1, 2, 3, 4},4));
    }


}
