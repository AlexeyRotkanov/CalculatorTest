package com.epam.at.junittests;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest extends ConfigurationTest {

    @Test
    public void additionTest() {
        long a = 4;
        long b = -5;
        long result = calculator.sum(a, b);
        Assert.assertEquals("Incorrect addition of " + a + " + " + b + ". ", -1, result);
    }
}
