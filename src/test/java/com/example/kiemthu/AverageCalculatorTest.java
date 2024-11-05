package com.example.kiemthu;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AverageCalculatorTest {

    private AverageCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new AverageCalculator();
    }

    @Test
    public void testCase_TC1() {
        int[] values = {-999,140,20,100};
        int result = calculator.average(values, 0, 15);
        assertEquals(-999, result);
    }

    @Test
    public void testCase_TC2() {
        int[] values = {10,20,5,30,-999};
        int result = calculator.average(values, 500, 1000);
        assertEquals(-999, result);
    }

    @Test
    public void testCase_TC3() {
        int[] values = {1000, 200, 200, -999};
        int result = calculator.average(values, 0, 100); 
        assertEquals(-999, result);
    }

    @Test
    public void testCase_TC4() {
        int[] values = {20, 20, 50, -999};
        int result = calculator.average(values, 5, 50);
        assertEquals(30, result);
    }

    
}
