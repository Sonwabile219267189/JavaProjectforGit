/*
 * Author: Sonwabile Gxoyiya
 * Student Number: 219267189
 * Group Leader
 * File: PhoneTest.java
 */

package za.ac.cput.JavaProjectForGit;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;
class PhoneTest {

    private Phone phone1;
    private Phone phone2;
    private Phone phone3;

    @BeforeEach
    void setUp() {
        phone1 = new Phone();
        phone2 = new Phone();
        phone3 = phone1;
    }

    //This tests Object Identity
    @Test
    void testIdentity()
    {
        System.out.println("Test values in two different objects");
        phone1.setBrand("Motorola");
        phone2.setBrand("Motorola");
        assertSame(phone2.getBrand(), phone1.getBrand());
    }

    //This tests Object Equality
    //Any value smaller than 2 the test will fail
    @Test
    @Timeout(value = 8000)
    public void testRunApplication()
    {
        phone2.setProcessorPower(3);
        System.out.println("Expected result is: " + phone2.runApplication());
        assertEquals("Successfully open Application",phone2.runApplication());


    }

    //failing test
    @Test
    public void testSetBrand()
    {
        phone1.setBrand("Samsung");
        assertEquals("Samsung",phone1.getBrand());
        //fail("Test was failed intentially");
    }

    //Diabling Test
    @Test
    @Ignore
    public void testSetSerialNumber()
    {
        phone1.setSerialNumber(2781992);
        assertEquals(2781992, phone1.getSerialNumber());
    }


}