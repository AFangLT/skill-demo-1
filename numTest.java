import org.junit.Test;
import static org.junit.Assert.*;

public class numTest {
    num five = new num(5);
    @Test
    public void testNum() {
        assertTrue("should fail", five.greaterThan(6));
    }
}
