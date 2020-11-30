package com.epam.at.junittests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Iterator;

@RunWith(Parameterized.class)
public class MultiplicationTest extends ConfigurationTest {

    private double a, b;
    private double expectedResult;

    public MultiplicationTest(double a, double b, double expectedResult) {
        this.a = a;
        this.b = b;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> valuesForMultiplicationTest() {
        return Arrays.asList(new Object[][]{
                        {2, 2, 4},
                        {-5, -3, 15},
                        {-4, 1, -4},
                        {11, 0, 0}
                }
        );
    }

    @Test
    public void multiplicationTest() {
        double result = calculator.mult(a, b);
        Assert.assertEquals(expectedResult, result, 0.01);
    }
}
