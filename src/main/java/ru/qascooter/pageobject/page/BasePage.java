package ru.qascooter.pageobject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.qascooter.EnvConfig;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.DEFAULT_TIMEOUT));
    }
    protected WebElement getElementByIndex(By selector, int index){
        wait.until(ExpectedConditions.presenceOfElementLocated(selector));
        return driver.findElements(selector).get(index);
    }
    protected WebElement getElement(By selector){
        wait.until(ExpectedConditions.presenceOfElementLocated(selector));
        return driver.findElement(selector);
    }
    protected List<WebElement> getElements(By selector){
        wait.until(ExpectedConditions.presenceOfElementLocated(selector));
        return driver.findElements(selector);
    }

}
