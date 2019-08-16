package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudAppTestingApp {
    public final static String XPATH_INPUT = "//html/body/main/section/form/fieldset/input";
    public final static String XPATH_TEXTAREA = "//html/body/main/section/form/fieldset[2]/textarea";
    public final static String XPATH_WAIT = "//select[1]";
    public final static String XPATH_SELECT = "//div[contains(@class, \"tasks-container\")]/form/div/fieldset/select[1]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://mrasinski.github.io/");

        WebElement search = driver.findElement(By.xpath(XPATH_INPUT));
        search.sendKeys("New robotic task");

        WebElement textArea = driver.findElement(By.xpath(XPATH_TEXTAREA));
        textArea.sendKeys("The robotic content");

        while (!driver.findElement(By.xpath(XPATH_WAIT)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));
        Select select = new Select(selectCombo);
        select.selectByIndex(1);

    }
}
