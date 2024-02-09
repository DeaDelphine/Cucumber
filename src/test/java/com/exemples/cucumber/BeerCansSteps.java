package com.exemples.cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BeerCansSteps {
    private int openingBalance;
    private int processed;
    private int inStock;

    @Given("I have {int} beer cans")
    public void i_have_beer_cans(int openingBalance) {
        this.openingBalance = openingBalance;
    }

    @Given("I have drunk {int} beer cans")
    public void i_have_drunk_beer_cans(int processed) {
        this.processed = processed;
    }

    @When("I go to my fridge")
    public void i_go_to_my_fridge() {
    }

    @Then("I should have {int} beer cans")
    public void i_should_have_beer_cans(int expectedInStock) {
        this.inStock = openingBalance - processed;
        Assert.assertEquals(expectedInStock, inStock);
    }
}
