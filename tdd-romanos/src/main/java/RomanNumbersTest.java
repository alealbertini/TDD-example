import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumbersTest extends RomanNumber {

    public static void main(String[] args) {
        test01();
        test02();
        test03();
        test04();
    }

    @Test
    static
    void test01() {
        assertEquals("I", new RomanNumber().getRomanNumber(1));
    }

    @Test
    static
    void test02() {
        assertEquals("II", new RomanNumber().getRomanNumber(2));
    }

    @Test
    static
    void test03() {
        assertEquals("III", new RomanNumber().getRomanNumber(3));
    }

    @Test
    static
    void test04() {
        assertEquals("IV", new RomanNumber().getRomanNumber(4));
    }
}
