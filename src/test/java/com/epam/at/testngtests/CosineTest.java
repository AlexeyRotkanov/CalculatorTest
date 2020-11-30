package com.epam.at.testngtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosineTest extends ConfigurationTest {

    @Test(dataProvider = "valuesForCosineTests", groups = {"trigonometry"})
    public void cosineTest(double a, double expectedResult) {
        double result = calculator.cos(Math.toRadians(a));
        Assert.assertEquals(result, expectedResult, "Incorrect cos of " + a + ": ");
    }

    @DataProvider(name = "valuesForCosineTests")
    public Object[][] valuesForCosineTests() {
        return new Object[][] {
                {0, 1},
                {60, 0.5},
                {90, 0}
        };
    }
}
