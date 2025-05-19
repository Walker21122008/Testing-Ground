package recursion;

public class CountChar {
    /**
     * Recursively counts the occurrences of a specified character in a given string.
     *
     * @param s the input string
     * @param c the character to count
     * @return the number of occurrences of the character in the string
     * @author Hasini Vijay Inbasri
     */

    public static int countChar(String s, char c){

        //base case
        if (s.length() == 0) {
            return 0;
        }

        //recursive case
        if (s.charAt(0) == c) {
            return 1 + countChar(s.substring(1), c);
        }
        return countChar(s.substring(1), c);
        
    }

    public static void main(String[] args) {
        System.out.println(countChar("Hatsune Miku", 'u'));
    }
}
