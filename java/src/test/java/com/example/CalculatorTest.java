package com.example;


import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        Assert.assertEquals(10, Calculator.sum(4,6));
    }
}
