import org.junit.Test;

import static org.junit.Assert.*;

public class TestSquare {

    QuizOneJunit obj = new QuizOneJunit();

    @Test
    public void test01() {
        assertEquals(obj.square(5),25);

    }

    @Test
    public void test02() {
        assertNotEquals(obj.square(5), 24);
    }

    @Test
    public void test03() {
        assertTrue(obj.square(4) == 16);
    }

    @Test
    public void test04() {
        assertFalse(obj.square(2) == 3);
    }

    @Test
    public void test05(){
        assertSame(obj.square(2),4);
    }

    @Test
    public void test06(){
        assertNotSame(obj.square(4),15);
    }

    @Test
    public void test07(){
        assertNotNull(obj.square(5));
    }

}
