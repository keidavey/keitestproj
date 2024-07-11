package com.keitestproj.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebDriverUtils {
    public static WebDriver driver;

    public static void setUp() {

        ConfigReader.readProperties(FrameworkConstants.LOCAL_TEST_SETTINGS_FILEPATH);
        String browser = ConfigReader.getPropertyValue("browser");
        String isHeadless = ConfigReader.getPropertyValue("headless");

        if (browser.equalsIgnoreCase("chrome")) {
            if (isHeadless.equalsIgnoreCase("true")) {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless=new");
                driver = new ChromeDriver(chromeOptions);
            } else {
                driver = new ChromeDriver();
            }
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("*** INVALID BROWSER NAME ***");
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void tearDown() {
        driver.quit();
    }
}
