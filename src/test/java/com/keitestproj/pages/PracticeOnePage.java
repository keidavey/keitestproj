package com.keitestproj.pages;

import com.keitestproj.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeOnePage {

    public PracticeOnePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    @FindBy(xpath = "//h2[contains(text(), 'List of Countries, Capitals, Currencies and Languages')]")
    public WebElement tableTitle;

    @FindBy(xpath = "//table[@id='countries']/tbody/tr[1]/td")
    public List<WebElement> tableHeaders;


    public static WebElement dynamicTextLocator(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'"+ text + "')]//ancestor::tr/td/input"));

    }
}

