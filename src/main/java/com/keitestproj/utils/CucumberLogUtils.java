package com.keitestproj.utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CucumberLogUtils extends WebDriverUtils {

    public static Scenario scenario;

    public static void logScreenshot() {
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "Attaching screenshot to reports");
    }
}
