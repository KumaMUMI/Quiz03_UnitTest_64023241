import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCountLetterA {

    QuizOneJunit obj = new QuizOneJunit();

    @Test
    public void test01() {
        assertEquals(obj.countLetterA("aaakimAAop"), 5);

    }

    @Test
    public void test02() {
        assertNotEquals(obj.countLetterA("aaakimAAop"), 3);
    }

    @Test
    public void test03() {
        assertTrue(obj.countLetterA("aaakimAAop") > 3);
    }

    @Test
    public void test04() {
        assertFalse(obj.countLetterA("aaakimAAop") == 3);
    }

    @Test
    public void test05() {
        assertSame(obj.countLetterA("aaakimAAop"), 5);
    }

    @Test
    public void test06(){
        assertNotSame(obj.countLetterA("aaakimAAop"),4);
    }

    @Test
    public void test07(){
        assertNotNull(obj.countLetterA("aaakimAAop"));
    }
}
