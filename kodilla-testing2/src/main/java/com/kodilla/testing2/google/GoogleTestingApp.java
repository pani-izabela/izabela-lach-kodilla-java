package com.kodilla.testing2.google;


import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SCHEARCHFIELD = "lst-ib";
    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.google.com");

        WebElement schearchField = driver.findElement(By.id(SCHEARCHFIELD));
        schearchField.sendKeys("Kodilla");
        schearchField.submit();
    }
}
