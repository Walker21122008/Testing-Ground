package recursion;

public class cleanString {
    public static String cleanString(String s){
        if (s.length() <= 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return cleanString(s.substring(1));
        } else {
            return s.charAt(0) + cleanString(s.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(cleanString("aaabbccdaa")); 
    }


}
