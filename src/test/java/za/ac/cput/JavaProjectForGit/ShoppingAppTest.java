package za.ac.cput.JavaProjectForGit;
/**
 * 217205135 Branch
 * Khanya Gibisela- 217205135
 *
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingAppTest {

    private ShoppingApp.Product p1,p2;

    @BeforeEach
    void setUp() {
        p1 =p2;
    }
    @Test
    public void testForEquality(){
        Assertions.assertEquals(p1,p2);
    }

    @Test
    public void TestForIdentity(){
        Assertions.assertSame(p1,p2);
    }

    @Test
    public void getName()
    {org.junit.jupiter.api.Assertions.fail("Make the test false. Not implementation");}

    @Test
    //@org.junit.jupiter.api.Timeout(value = 1000 , unit = NANOSECONDS);
    public void testTimeout() throws InterruptedException {
        int timeout = 10;
        TimeUnit.SECONDS.sleep(timeout);
        System.out.println(" Setting the Timeout");
    }
    @Test
    @Disabled
    public void testDisable(){
        org.junit.jupiter.api.Assertions.fail("The test should fail. The program is still in process");
    }


}