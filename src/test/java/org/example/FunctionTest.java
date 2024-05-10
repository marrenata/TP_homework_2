package org.example;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class FunctionTest {

    private static final int[] testDataSizes = {1000, 10000, 100000};
    private static int[][] testData;

    @BeforeClass
    public static void setup() {
        testData = new int[testDataSizes.length][];
        Random random = new Random();
        for (int i = 0; i < testDataSizes.length; i++) {
            testData[i] = new int[testDataSizes[i]];
            for (int j = 0; j < testDataSizes[i]; j++) {
                testData[i][j] = random.nextInt();
            }
        }
    }

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

    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        try {
            Function._min(emptyArray);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Test passes if this exception is thrown
        }
    }

    @Test
    public void testPerformance() {
        for (int i = 0; i < testData.length; i++) {
            long startTime = System.nanoTime();
            Function._min(testData[i]);
            Function._max(testData[i]);
            Function._sum(testData[i]);
            Function._mult(testData[i]);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Test data size: " + testDataSizes[i] + ", Time taken (ns): " + duration);
        }
    }
}
