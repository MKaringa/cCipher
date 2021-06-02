import org.junit.Test;

import static org.junit.Assert.*;

public class CaeserCipherTest {
    @Test
    public void newCaesarCipher_getMessage_running() {
        CaeserCipher testCaesarCipher = new CaeserCipher("running",5);
        assertEquals("hi",testCaesarCipher.getTheMessage());
    }

    @Test
    public void newCaesarCipher_getshiftKey_3() {
        CaeserCipher testCaesarCipher = new CaeserCipher("good",5);
        assertEquals("hi",testCaesarCipher.getshiftKey());
    }

}