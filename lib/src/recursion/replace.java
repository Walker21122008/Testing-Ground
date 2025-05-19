package recursion;

public class replace {
    public static String replaceChar(String s, char target, char replacement) {

        if (s.length() == 0) {
            return s;
        }
        char firstChar = s.charAt(0);

        if (firstChar == target) {
            firstChar = replacement;
        }

        return firstChar + replaceChar(s.substring(1), target, replacement);
    }

    public static void main(String[] args) {
        System.out.println(replaceChar("Banana", 'a', 's')); 
    }

}
