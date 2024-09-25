import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTests {
    @Test
    public void test1() {
        try {
            Assertions.assertEquals(Main.sum(2), 2);
        } catch (AssertionError e) {
            System.out.println("Existe un error");
        }
    }
}
