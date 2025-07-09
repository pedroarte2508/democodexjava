import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    @Test
    public void testMainRuns() {
        HelloWorld.main(new String[]{});
        assertTrue(true);
    }
}
