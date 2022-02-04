import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    SkillDemo five = new SkillDemo(5);
    @Test
    public void testStuff() {
        assertTrue("Should fail", five.greaterThan(6));
    }
}
