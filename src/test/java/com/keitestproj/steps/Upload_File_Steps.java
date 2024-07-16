package com.keitestproj.steps;

import com.keitestproj.pages.UploadFilePage;
import com.keitestproj.utils.FrameworkConstants;
import com.keitestproj.utils.WebDriverUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Upload_File_Steps {

    UploadFilePage uploadFilePage = new UploadFilePage();

    @When("the user chooses a file")
    public void the_user_chooses_a_file() throws InterruptedException {
//        uploadFilePage.chooseFileButton.click();
        Thread.sleep(3000);
        uploadFilePage.chooseFileButton.sendKeys(FrameworkConstants.LOCAL_UPLOAD_DOCUMENT_FILEPATH);
        System.out.println(FrameworkConstants.LOCAL_UPLOAD_DOCUMENT_FILEPATH + "*********");
    }

    @Then("the file is uploaded")
    public void the_file_is_uploaded() throws InterruptedException {
        uploadFilePage.uploadButton.click();
        Thread.sleep(4000);
        Assert.assertTrue(uploadFilePage.fileUploadedText.isDisplayed());
    }
}
