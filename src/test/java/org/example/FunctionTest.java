package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FunctionTest {

    @Test
    public void testMin() {
        int[] numbers = {5, 8, 3, 12, 7};
        assertEquals(3, Function._min(numbers));
    }

    @Test
    public void testMax() {
        int[] numbers = {5, 8, 3, 12, 7};
        assertEquals(12, Function._max(numbers));
    }

    @Test
    public void testSum() {
        int[] numbers = {5, 8, 3, 12, 7};
        assertEquals(35, Function._sum(numbers));
    }

    @Test
    public void testMult() {
        int[] numbers = {5, 8, 3, 12, 7};
        assertEquals(10080, Function._mult(numbers));
    }
}
