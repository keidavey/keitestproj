package com.keitestproj.pages;

import com.keitestproj.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilePage {

    public UploadFilePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    @FindBy(xpath = "//input[@id='fileInput']")
    public WebElement chooseFileButton;

    @FindBy(xpath = "//button[@id='fileSubmit']")
    public WebElement uploadButton;

    @FindBy(xpath = "//h1[normalize-space()='File Uploaded!']")
    public WebElement fileUploadedText;
}
