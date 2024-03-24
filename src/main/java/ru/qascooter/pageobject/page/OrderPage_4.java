package ru.qascooter.pageobject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//класс страницы заполнения формы заказа_4
public class OrderPage_4 extends BasePage {
    private final By selectResultMessage = By.xpath("//div[contains(@class,'Order_Modal')]//div[contains(@class,'Order_ModalHeader')]");
    public OrderPage_4(WebDriver driver) {
        super(driver);
    }

    public String getResultMessage() {
        return getElement(selectResultMessage).getText();
    }
}