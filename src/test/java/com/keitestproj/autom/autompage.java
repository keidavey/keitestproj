package com.keitestproj.autom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autompage {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://cosmocode.io/automation-practice-webtable/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


    }
}
