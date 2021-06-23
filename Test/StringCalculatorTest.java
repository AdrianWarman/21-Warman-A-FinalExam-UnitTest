import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


public class StringCalculatorTest {
    private StringCalculator string;

    @BeforeEach
    public void setUp() {
        string = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        string = null;
    }

    @Test
    public void test1() {
        string.add("-1,5");
        assertEquals(4, string.add("-1,5"));
    }
    @Test
    public void test2() {
        string.add("1,1000");
        assertEquals(1001, string.add("1,1000"));
    }

}
