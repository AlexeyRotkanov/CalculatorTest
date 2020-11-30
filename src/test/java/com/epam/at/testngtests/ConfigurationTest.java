package com.epam.at.testngtests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

public class ConfigurationTest {

    protected Calculator calculator;

    @BeforeClass(groups = {"common", "boolean", "trigonometry"})
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterClass(groups = {"common"})
    public void tearDown() {
        calculator = null;
    }

}
