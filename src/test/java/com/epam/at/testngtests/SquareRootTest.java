package com.epam.at.testngtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SquareRootTest extends ConfigurationTest {

    @Test(dataProvider = "valuesForSquareRootTest", groups = {"common"})
    public void squareRootTest(double a, double expectedResult) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedResult, "Incorrect square root of " + a + ". ");
    }

    @DataProvider(name = "valuesForSquareRootTest")
    public Object[][] valuesForSquareRootTest() {
        return new Object[][] {
                {9, 3},
                {16, 4},
                {1, 1}
        };
    }
}
