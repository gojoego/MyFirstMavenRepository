package com;

import org.junit.Test;
import sun.java2d.jules.JulesAATileGenerator;

import static org.junit.Assert.*;

public class JUnitPracticeTest {

    @Test
    public void multiply() {
        JUnitPractice tester = new JUnitPractice();
        assertEquals(4, tester.multiply(2,2));
        assertNotEquals(5, tester.multiply(2,3));
    }

    @Test
    public void divide() {
        JUnitPractice tester = new JUnitPractice();
        assertEquals(4, tester.divide(8,2));
        assertNotEquals(5, tester.divide(12,3));
    }
/*
    @Test
    public void divide() {
        JUnitPractice tester = new JUnitPractice();
        assertEquals(4, tester.divide(8,2));
        assertNotEquals(5, tester.divide(12,3));
    }

 */
}