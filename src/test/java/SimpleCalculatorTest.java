import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("Test add 0 + 0")
    public void testAdd1() {
        int first = 0;
        int second = 0;
        int ketQuaMongMuon = 0;

        int result = SimpleCalculator.add(first, second);

        assertEquals(ketQuaMongMuon, result);
    }

    @Test
    @DisplayName("Test add 0 + 1")
    public void testAdd0And1() {
        int first = 0;
        int second = 1;
        int kqMongMuon = 1;

        int result = SimpleCalculator.add(first, second);
        assertEquals(kqMongMuon, result);
    }
    @Test
    @DisplayName("Test add 1 + 1")
    public void testAdd1And1() {
        int first = 1;
        int second = 1;
        int kqMongMuon = 2;

        int result = SimpleCalculator.add(first, second);
        assertEquals(kqMongMuon, result);
    }

    //Test se tra ra ket qua loi
    @Test
    @DisplayName("Test add 0 - 0")
    public void testSub0And0() {
        int first = 0;
        int second = 0;
        int kqMongMuon = 1;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(kqMongMuon, result);
    }
}
