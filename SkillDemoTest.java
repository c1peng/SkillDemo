import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    
    @Test
    public void testminus() {
        assertEquals(2, SkillDemo.minus(4, 3)); // it supposed to be 5-3
    }
}
