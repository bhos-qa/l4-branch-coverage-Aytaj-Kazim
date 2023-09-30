package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathOpsTest {

    @Test
    public void testCalculateRectangleArea() {
        MathOps logic = new MathOps();
        double area = logic.calculateRectangleArea(5.0, 4.0);
        Assertions.assertEquals(20.0, area, 0.01);
    }

    @Test
    public void testIsPrime() {
        MathOps logic = new MathOps();
        Assertions.assertTrue(logic.isPrime(7));
        Assertions.assertFalse(logic.isPrime(4));
    }

    @Test
    public void testCalculateFactorial() {
        MathOps logic = new MathOps();
        int factorial = logic.calculateFactorial(5);
        Assertions.assertEquals(120, factorial);
    }

    @Test
    public void testIntToBinary() {
        MathOps logic = new MathOps();
        String binary = logic.intToBinary(10);
        Assertions.assertEquals("1010", binary);
    }

    @Test
    public void testFindMax() {
        MathOps logic = new MathOps();
        int max = logic.findMax(7, 10);
        Assertions.assertEquals(10, max);
    }

}