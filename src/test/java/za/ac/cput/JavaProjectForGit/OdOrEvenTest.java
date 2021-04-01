package za.ac.cput.JavaProjectForGit;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class OdOrEvenTest {
    @Test(timeout = 10000)

    public void testAwnser(){
        OdOrEven testItem = new OdOrEven();
        String value=testItem.check(3);
        assertEquals("not even",value);
    }
    @Ignore
    @Test
    public void checkExcistince(){
        OdOrEven testItem = new OdOrEven();
        String value=testItem.check(3);
        assertNotNull(value);
        fail();

    }



    @Test
    public void testIdentity(){
        OdOrEven testItem = new OdOrEven();
        String value=testItem.check(3);
        assertSame("not even",value);
    }


}
