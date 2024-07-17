package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Calculator;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MyFirstJUnitJupiterTests {

  private final Calculator calculator = new Calculator();


    @Test
    @Tag("zero")
    void addition0(){
        assertEquals(2,calculator.add(1,1));
    }

    @FastTest
    void addition(){
     assertEquals(2,calculator.add(1,1));
    }

    @SlowTest
    void addition2(){
        assertEquals(2,calculator.add(1,1));
    }

}
