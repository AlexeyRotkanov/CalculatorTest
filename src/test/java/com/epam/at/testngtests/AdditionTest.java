package com.epam.at.testngtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdditionTest extends ConfigurationTest {

    @Test(description = "Test of addition operation", dataProvider = "valuesForAddition",
            groups = {"common"})
    public void additionTest(long a, long b, long expectedResult) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult, "Incorrect addition of " + a + " + " + b + ". ");
    }

    @DataProvider(name = "valuesForAddition")
    public Object[][] valuesForAddition() {
        return new Object[][]{
                {1, 2, 3},
                {1, -1, 0},
                {1, 0, 1},
                {-5, -4, -9}
        };
    }
}
