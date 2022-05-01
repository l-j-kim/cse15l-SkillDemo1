import org.junit.*;
import static org.junit.Assert.*;

public class demo1Test {
    @Test
    public void testString() {
        assertEquals("Hello World!", demo1.addExclamation("Hello"));
    }
}
