package za.ac.cput.JavaProjectForGit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class AddingTest {


        Adding test= new Adding();

        @Test
        public void testEquality() {
            int results =test.addictionz(5, 5);
            assertEquals(10,results);
        }
        @Test
        public void testIdentity(){
            int results = test.addictionz(1,5);
            assertSame(6,results);

        }
        @Test
        public void testFailingTest(){

        }
        @Test
        @Timeout(6)
        public void testTimeout() throws InterruptedException {
            Thread.sleep(5000);
            int results = test.addictionz(1,5);
            assertSame(6,results);
        }
        @Disabled("additioon disabled")
        @Test
        public void testDisable() {
            int results =test.addictionz(5, 5);
            assertEquals(10,results);
        }

    }

