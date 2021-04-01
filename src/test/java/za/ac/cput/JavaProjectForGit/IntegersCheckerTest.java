package za.ac.cput.JavaProjectForGit;

/**
 * @author Bheka Gumede 218223420
 * This program check integers
 *
 */


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;


import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;



class IntegerCheckerTest {
    int a =20;
    int b =20;
    int c =b;
    int d = 90;

    @BeforeEach
    void setUp() {

    }

    @Test
    void testIdentity() {
        assertSame(a, b);

    }

    @Test
    void testEquality() {
        assertEquals(c, b);

    }

    @Test
    void failTest() {
        assertSame(c, d);

    }

    @Test
    void testTimeouts() {
        assertTimeout(Duration.ofMillis(20), () -> { Thread.sleep(1000); });
    }
    @Disabled
    @Test
    void disableTest(){
        assertEquals(b,c,a);

    }
}
