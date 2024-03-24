package ru.qascooter.pageobject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//класс страницы заполнения формы заказа_3
public class OrderPage_3 extends BasePage {
    //оформление заказа - кнопка Да
    private final By selectOrderYesButton = By.xpath("//div[contains(@class,'Order_Modal')]//button[not(contains(@class,'Button_Inverted'))]");
    public OrderPage_3(WebDriver driver) {
        super(driver);
    }

    public OrderPage_4 clickYesButton() {
        getElement(selectOrderYesButton).click();
        return new OrderPage_4(driver);
    }
}