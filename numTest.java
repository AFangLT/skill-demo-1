import static org.junit.Assert.*;
import org.junit.*;

public class numTest {
    num five = new num(5);
    @Test
    public void testNum() {
        assertEquals(2, five.sum(2));
    }
}
