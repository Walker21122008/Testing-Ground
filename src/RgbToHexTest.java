// Imports
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RgbToHexTest {

    @Test
    public void rgbTests() {
        assertEquals("000000", RgbToHex.rgb(0, 0, 0));
        assertEquals("FFFFFF", RgbToHex.rgb(255, 255, 255));
        assertEquals("FEFDFC", RgbToHex.rgb(254, 253, 252));
    }

    @Test
    public void testMorseCodeDecode() {
        assertEquals("HEYJUDE", morseCode.decode(".... . -.-- .--- ..- -.. ."));
    }

}
