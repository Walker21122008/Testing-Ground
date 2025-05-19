package recursion;

public class ReverseString {
    /**
     * Reverses the given string using recursion.
     *
     * @param s The string to be reversed.
     * @return The reversed string.
     * @author Hasini Vijay Inbasri
     */
    public static String reverse(String s) {

        //base case
        if (s.length() == 1) {
            return s;
        }

        //recursion case
        return reverse(s.substring(1)) + s.substring(0,1);
    }

    public static void main(String[] args) {
        System.out.println(reverse("meaw"));
    }
}

