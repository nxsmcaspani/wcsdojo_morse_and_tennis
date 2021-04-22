import junit.framework.*;
import org.junit.Test;
import org.junit.Assert;

public class TennisTest extends TestCase {

    @Test
    public void testTrue() throws Exception {
        assertEquals(true, true);
    }

    // TODO
    @Test
    public void test1() throws Exception {
        Assert.assertArrayEquals(new String[]{"30", "40"}, Tennis.score(new int[]{1, 1, 2, 2, 2}) );
    }
    @Test
    public void test2() throws Exception {
        String[] tab = {"40", "40a"};
        int[] score = {2, 1, 2, 1, 1, 2, 2, 1, 2};
        Assert.assertArrayEquals(tab, Tennis.score(score));
    }
}