package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public final static String XPATH_YEAR = "//*[@id=\"year\"]";
    public final static String XPATH_MONTH = "//*[@id=\"month\"]";
    public final static String XPATH_DAY = "//*[@id=\"day\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        selectDay.sendKeys("23");

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        selectMonth.sendKeys("maj");

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        selectYear.sendKeys("1988");
    }
}
