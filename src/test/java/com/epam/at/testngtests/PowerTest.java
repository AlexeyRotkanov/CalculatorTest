package com.epam.at.testngtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowerTest extends ConfigurationTest {

    @Test(dataProvider = "valuesForPowerTest", groups = {"common"})
    public void powerTest(double a, double b, double expectedResult) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedResult, "Incorrect addition of " + a + " + " + b + ". ");
    }

    @DataProvider(name = "valuesForPowerTest")
    public Object[][] valuesForPowerTest() {
        return new Object[][] {
                {2, 2, 4},
                {3, 3, 27},
                {4, -1, 0.25},
                {7, 0, 1}
        };
    }
}
