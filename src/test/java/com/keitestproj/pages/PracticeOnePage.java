package com.keitestproj.pages;

import com.keitestproj.utils.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeOnePage {

    public PracticeOnePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    @FindBy(xpath = "//h2[contains(text(), 'List of Countries, Capitals, Currencies and Languages')]")
    public WebElement tableTitle;
}
