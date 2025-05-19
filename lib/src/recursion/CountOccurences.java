package recursion;

public class CountOccurences {
    public static int countOccurrences(int[] arr, int n, int target) {
        if (n == 0) {
            return 0;
        }
        
        int count = 0;

        if (arr[n - 1] == target) {
            count = 1;
        }

        return count + countOccurrences(arr, n - 1, target);
    }

}
