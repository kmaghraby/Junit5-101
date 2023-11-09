package org.kareem.learn;

import org.junit.jupiter.api.Test;
import org.kareem.learn.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testDivide(){

        Calculator c = new Calculator();
        assertEquals(2, c.divide(10,5));
        assertNotEquals(4,c.divide(10,5));
    }

    @Test
    void testAdd(){
        Calculator c = new Calculator();
        assertEquals(9,c.Add(3,6));
        assertNotEquals(5,c.Add(3,6));
    }

}
