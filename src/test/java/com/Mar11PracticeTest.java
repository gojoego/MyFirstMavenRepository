package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class Mar11PracticeTest {

    @Test
    public void age() {
        Mar11Practice test = new Mar11Practice();
        assertTrue("Yes",test.age(100));
        assertFalse("No",test.age(33));
    }

    @Test
    public void cylinderVol() {
        Mar11Practice test = new Mar11Practice();
        assertEquals(471.23889803846896, test.cylinderVol(5.0, 6.0), 0);
        assertNotEquals(352, test.cylinderVol(5,3));
    }

    @Test
    public void bodyMassIndex() {
        Mar11Practice test = new Mar11Practice();
        assertEquals(6,test.bodyMassIndex(150,5),0);
        assertNotEquals(10,test.bodyMassIndex(34,34), 0);

    }

    @Test
    public void yearToMinutes() {
        Mar11Practice test = new Mar11Practice();
        assertEquals(17344800,test.yearToMinutes(33),0);
        assertNotEquals(2342342,test.yearToMinutes(23),0);

    }

    @Test
    public void olderOrYounger() {
        Mar11Practice test = new Mar11Practice();

    }
}