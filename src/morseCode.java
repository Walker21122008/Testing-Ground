public class morseCode {
    private static final String[] alphabet = {
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        ".", ",", "?", "!", "/", "(", ")", "'", "\""
    };
    
    private static final String[] morseCode = {
        ".-",   // A
        "-...", // B
        "-.-.", // C
        "-..",  // D
        ".",    // E
        "..-.", // F
        "--.",  // G
        "....", // H
        "..",   // I
        ".---", // J
        "-.-",  // K
        ".-..", // L
        "--",   // M
        "-.",   // N
        "---",  // O
        ".--.", // P
        "--.-", // Q
        ".-.",  // R
        "...",  // S
        "-",    // T
        "..-",  // U
        "...-", // V
        ".--",  // W
        "-..-", // X
        "-.--", // Y
        "--..", // Z
        "-----", // 0
        ".----", // 1
        "..---", // 2
        "...--", // 3
        "....-", // 4
        ".....", // 5
        "-....", // 6
        "--...", // 7
        "---..", // 8
        "----.", // 9
        ".-.-.-", // .
        "--..--", // ,
        "..--..", // ?
        "-.-.--", // !
        "-..-.",  // /
        "-.--.",  // (
        "-.--.-", // )
        ".----.",  // '
        ".-..-.",  // "
    };

    public static String decode(String morseCodeStr) {
        String decodedStr = "";
        String[] morseCodeSeperateParts = morseCodeStr.split(" ");
        for (int i = 0; i < morseCodeSeperateParts.length; i++) {
            if(morseCodeSeperateParts[i].equals('/')){
                decodedStr += " ";
            }
            else{
                for (int j = 0; j < morseCode.length; j++){
                    if(morseCodeSeperateParts[i].equals(morseCode[j])){
                        decodedStr += alphabet[j];
                    }
                }
            }
        }
        return decodedStr;
    }

    public static void main(String[] args) {
        System.out.println(decode(".... . -.-- .--- ..- -.. ."));
        System.out.println(decode("... --- ..."));
    }
}
