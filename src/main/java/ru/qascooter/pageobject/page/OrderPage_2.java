package ru.qascooter.pageobject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//класс страницы заполнения формы заказа_2
public class OrderPage_2 extends BasePage {
    //поле Когда привезти самокат
    private final By selectWhenBringScooter = By.xpath("//div[contains(@class,'Order_Content')]//div[contains(@class,'Order_MixedDatePicker')]//input");
    //поле Срок аренды
    private final By selectRentalPeriod = By.xpath("//div[contains(@class,'Order_Content')]//span[contains(@class,'Dropdown-arrow')]");
    //поле выбора срока аренды
    private final By selectRentalPeriodList = By.xpath("//div[contains(@class,'Order_Content')]//div[contains(@class,'Dropdown-menu')]//div[contains(@class,'Dropdown-option')]");
    //выбор черного цвета самоката
    private final By selectBlackColor = By.id("black");
    //выбор серого цвета самоката
    private final By selectGrayColor = By.id("grey");
    //коментарий для курьера
    private final By selectCommentCourier = By.xpath("//div[contains(@class,'Order_Content')]//div[contains(@class,'Input_InputContainer')]//input");
    //кнопка Заказать
    private final By selectOrderButton = By.xpath("//div[contains(@class,'Order_Buttons')]//button[not(contains(@class,'Button_Inverted'))]");
    public OrderPage_2(WebDriver driver) {
        super(driver);
    }

    public OrderPage_2 setWhenBringScooter(String whenBringScooter) {
        getElement(selectWhenBringScooter).sendKeys(whenBringScooter);
        return this;
    }

    public OrderPage_2 setRentalPeriod(int rentalPeriod) {
        getElement(selectRentalPeriod).click();

        getElementByIndex(selectRentalPeriodList, rentalPeriod).click();
        return this;
    }

    public OrderPage_2 setBlackColor(boolean canBlack) {
        if (canBlack) getElement(selectBlackColor).click();
        return this;
    }

    public OrderPage_2 setGrayColor(boolean canGray) {
        if (canGray) getElement(selectGrayColor).click();
        return this;
    }

    public OrderPage_2 setCommentCourier(String commentCourier) {
        getElement(selectCommentCourier).sendKeys(commentCourier);
        return this;
    }

    public OrderPage_3 clickNextButton() {
        getElement(selectOrderButton).click();
        return new OrderPage_3(driver);
    }
}