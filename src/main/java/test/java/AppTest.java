
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testMainClassExists() {
        App app = new App();
        assertEquals(App.class, app.getClass());
    }

    @Test
    public void testAddition() {
        assertEquals(5, 2 + 3);
    }
}
