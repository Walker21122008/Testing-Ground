package recursion;

public class Palindrome {
    /**
     * Checks if a given string is a palindrome.
     * A palindrome is a word, phrase, or sequence that reads the same backward as forward.
     *
     * @param s the string to check
     * @return true if the string is a palindrome, false otherwise
     * @author Hasini Vijay Inbasri
     */
    public static boolean isPalindrome(String s) {

        //base case
        if (s.length() == 1) {
            return true;
        } 
        if(!s.substring(0,1).equalsIgnoreCase(s.substring(s.length()-1,s.length()))){
            return false;
        }

        //recursion case
        return isPalindrome(s.substring(1,s.length()-1));
        
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("loamd"));
    }

}
