import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCheckTwoLetter {
    QuizOneJunit obj = new QuizOneJunit();

    @Test
    public void test01() {
        assertEquals(obj.checkTwoLetter("aabbaa"), true);
    }

    @Test
    public void test02() {
        assertNotEquals(obj.checkTwoLetter("aabbaa"), obj.checkTwoLetter("aabbAA"));
    }

    @Test
    public void test03() {
        assertTrue(obj.checkTwoLetter("aabbaa") == obj.checkTwoLetter("abccab"));
    }

    @Test
    public void test04() {
        assertFalse(obj.checkTwoLetter("aabba"));
    }

    @Test
    public void test05(){
        assertSame(obj.checkTwoLetter("aabbaabb"),obj.checkTwoLetter("bbaabbaa"));
    }

    @Test
    public void test06(){
        assertNotSame(obj.checkTwoLetter("aabbaa"),obj.checkTwoLetter("bbaabbaa"));
    }

    @Test
    public void test07() {
        assertNotNull(obj.checkTwoLetter("aabbaa"));
    }

}
