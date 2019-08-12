package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public final static String SEARCHFIELD = "gLFyf gsfi";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://google.com");

        WebElement search = driver.findElement(By.cssSelector("input[class='" + SEARCHFIELD + "']"));
        search.sendKeys("Kodilla");
        search.submit();
    }
}
