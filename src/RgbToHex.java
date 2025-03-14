public class RgbToHex {

    //main methods running
    public static String rgb(int r, int g, int b) {
        String rBinary = decimalToBinary(r); 
        String gBinary = decimalToBinary(g);
        String bBinary = decimalToBinary(b);

        String rHex = binaryToHex(rBinary);
        String gHex = binaryToHex(gBinary);
        String bHex = binaryToHex(bBinary);

        return rHex + gHex + bHex;
    }

    private static String decimalToBinary(int decimal) {
        int decimalChanged = decimal>255?255:decimal;//checks if it is within bounds

        //checks if the decimal is 0
        if (decimal == 0) {
            return "00000000";
        }
        
        // set the variables
        String binary = "";
        int value = 1;
        
        //checks if the value is less than the decimal
        while (value <= decimalChanged) {
            value *= 2;
        }
        value /= 2;
        
        //subtracts the value
        while (value > 0) {
            if (decimalChanged >= value) {
                binary += "1";
                decimalChanged -= value;
            } else {
                binary += "0";
            }
            value /= 2;
        }
    
        return binary; //returns the value
    }
    
    //method to convert binary to hex
    private static String binaryToHex(String binary) {
        String hex = "";
        //goes through the loop and checks each 4 characters in the binary
        for (int i = 0; i < 8; i += 4) {
            String part = binary.substring(i, i + 4);
            hex += binaryToHexPart(part);
        }
        return hex;
    }

    private static String binaryToHexPart(String binaryPart) {
        //converts string to binary
        int decimalPart = Integer.parseInt(binaryPart, 2);
        if (decimalPart < 10) {
            return String.valueOf(decimalPart);
        } else {
            switch (decimalPart) {
                case 10:
                    return "A";
                case 11:
                    return "B";
                case 12:
                    return "C";
                case 13:
                    return "D";
                case 14:
                    return "E";
                case 15:
                    return "F";
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(rgb(255, 255, 255)); 
        System.out.println(rgb(255, 255, 300));  
        System.out.println(rgb(0, 0, 0));        
    }
}
