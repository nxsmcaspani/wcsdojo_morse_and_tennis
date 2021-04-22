import junit.framework.*;
import org.junit.Test;

public class MorseTest extends TestCase {
    @Test
    public void testTrue() throws Exception {
        assertEquals(true, true);
    }

    @Test
    public void test1() throws Exception {
        assertEquals("WILD", Morse.convert(".-- .. .-.. -.."));
    }

    @Test
    public void test2() throws Exception {
        Morse morse = new Morse();
        assertEquals("WILD CODE", Morse.convert(".-- .. .-.. -..   -.-. --- -.. ."));
    }
}