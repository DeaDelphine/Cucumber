package com.exemples.cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "classpath:features/beercan.feature" },
        glue = {"com.exemples.cucumber.beercanssteps" })
public class BeerTest {
}
