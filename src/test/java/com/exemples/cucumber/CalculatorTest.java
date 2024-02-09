package com.exemples.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "classpath:features/calculator.feature" },
        glue = {"com.exemples.cucumber.calculator" })
public class CalculatorTest {

}