package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ArraySortIntTest {

    @Test
    public static void sortedIntTest(){
ArraySorted arraySorted = new ArraySorted();
assertNotNull(arraySorted);
assertTrue(arraySorted.equals(""));
assertFalse("not ok",false);
assertEquals("is ok",arraySorted);

        int[] array = {3,2,1,6,5,0};
        ArraySorted.bubbleSortInt(array);
        int[] arraySortedInt = {0,1,2,3,5,6};
        assertArrayEquals(array,arraySortedInt);
    }
}
