package com.keitestproj.steps;

import com.keitestproj.utils.WebDriverUtils;
import io.cucumber.java.en.Given;

public class Practice_One_Steps {
    @Given("a user is on the {string} page")
    public void a_user_is_on_the_page(String url) {
        WebDriverUtils.driver.get(url);

    }
}
