package com.epam.at.testngtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionTest extends ConfigurationTest {

    @Test (description = "Test of subtraction operation", dataProvider = "valuesForSubtraction",
            groups = {"common"})
    public void subtractionTest(long a, long b, long expectedResult) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedResult, "Incorrect substrcation of " + a + " - " + b + ". ");
    }

    @DataProvider(name = "valuesForSubtraction")
    public Object[][] valuesForSubtraction() {
        return new Object[][] {
                {1, 1, 0},
                {10, 6, 4},
                {-5, -7, 2}
        };
    }
}
