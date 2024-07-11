package com.keitestproj.steps;

import com.keitestproj.pages.PracticeOnePage;
import com.keitestproj.utils.WebDriverUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Practice_One_Steps {

    PracticeOnePage practiceOnePage = new PracticeOnePage();

    @Given("a user is on the {string} page")
    public void a_user_is_on_the_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @When("the user verifies the title of the table is {string}")
    public void the_user_verifies_the_title_of_the_table_is(String tableTitle) {
        Assert.assertEquals(practiceOnePage.tableTitle.getText(), tableTitle);
    }

    @And("the user clicks the visited checkbox for Afghanistan and Andorra")
    public void the_user_clicks_the_visited_checkbox_for_afghanistan_and_andorra() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("verifies the table headers {string}, {string}, {string}, {string}, and {string}")
    public void verifies_the_table_headers_and(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the checkboxes are selected")
    public void the_checkboxes_are_selected() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
