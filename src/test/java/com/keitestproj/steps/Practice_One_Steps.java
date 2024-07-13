package com.keitestproj.steps;

import com.keitestproj.pages.PracticeOnePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.keitestproj.utils.WebDriverUtils.driver;

public class Practice_One_Steps {

    PracticeOnePage practiceOnePage = new PracticeOnePage();

    @Given("a user is on the {string} page")
    public void a_user_is_on_the_page(String url) {
        driver.get(url);
    }

    @When("the user verifies the title of the table is {string}")
    public void the_user_verifies_the_title_of_the_table_is(String tableTitle) {
        Assert.assertEquals(practiceOnePage.tableTitle.getText(), tableTitle);
    }

    @And("verifies the text of the table headers {string}, {string}, {string}, {string}, and {string}")
    public void verifies_the_text_of_the_table_headers_and(String headOne, String headTwo, String headThree, String headFour, String headFive) {
        for (int i = 0; i < practiceOnePage.tableHeaders.size(); i++) {
            String b = practiceOnePage.tableHeaders.get(i).getText();
            String[] a = {headOne, headTwo, headThree, headFour, headFive};
            Assert.assertEquals(a[i], b);
        }
    }

    @And("the user clicks the visited checkbox for {string} and {string}")
    public void the_user_clicks_the_visited_checkbox_for_and(String afghanistanText, String andorraText) throws InterruptedException {
        Thread.sleep(4000);
        PracticeOnePage.dynamicTextLocator(afghanistanText).click();
        PracticeOnePage.dynamicTextLocator(andorraText).click();
    }

    @Then("the checkboxes are selected {string} {string}")
    public void the_checkboxes_are_selected(String afghanistanText, String andorraText) {
        Assert.assertTrue(PracticeOnePage.dynamicTextLocator(afghanistanText).isSelected());
        Assert.assertTrue(PracticeOnePage.dynamicTextLocator(andorraText).isSelected());
    }
}
