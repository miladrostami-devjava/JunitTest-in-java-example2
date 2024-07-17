package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
        assertNotEquals(4,calculator.add(4,5),"is right ok");
        assertTrue(true);
        assertTrue(calculator.add(2,2) == 4);
        assertFalse(calculator.add(3,3) != 6);
        assertFalse(false);
        assertNotNull(calculator);
    }


    @Test
    void threePlusSevenShouldEqualTen(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertTrue(calculator.add(3,7) == 10);
    }

}