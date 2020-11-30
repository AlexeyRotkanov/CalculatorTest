package com.epam.at.junittests;

import org.junit.Assert;
import org.junit.Test;

public class IsPositiveTest extends ConfigurationTest {

    @Test
    public void testWithPositiveValue() {
        boolean result = calculator.isPositive(1);
        Assert.assertTrue(result);
    }

    @Test
    public void testWithNegativeValue() {
        boolean result = calculator.isPositive(-1);
        Assert.assertFalse(result);
    }

    @Test
    public void testWithZeroValue() {
        boolean result = calculator.isPositive(0);
        Assert.assertFalse(result);
    }
}
