package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//div[@class=\"large_form\"]/div[@class=\"_58mq _5dbb\"]/div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class=\"large_form\"]/div[@class=\"_58mq _5dbb\"]/div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class=\"large_form\"]/div[@class=\"_58mq _5dbb\"]/div[@class=\"_5k_5\"]/span/span/select[3]";

    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement dayField = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(dayField);
        selectDay.selectByIndex(11);

        WebElement monthField = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(monthField);
        selectMonth.selectByIndex(6);

        WebElement yearField = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(yearField);
        selectYear.selectByValue("1980");
    }
}
