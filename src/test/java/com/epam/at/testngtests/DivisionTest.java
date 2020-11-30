package com.epam.at.testngtests;

import org.testng.annotations.Test;

public class DivisionTest extends ConfigurationTest {

    @Test(description = "Test of division by 0", expectedExceptions = {NumberFormatException.class},
            groups = {"common"})
    public void divisionTest() {
        double result = calculator.div(1, 0);
    }
}
