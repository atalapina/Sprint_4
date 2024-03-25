package ru.qascooter.pageobject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//класс страницы заполнения формы заказа_1
public class OrderPage_1 extends BasePage {
    //поле Имя
    private final By selectName = By.xpath("(//div[contains(@class,'Order_Form')]//input)[1]");
    //поле Фамилия
    private final By selectLastName = By.xpath("(//div[contains(@class,'Order_Form')]//input)[2]");
    //поле Адрес
    private final By selectAddress = By.xpath("(//div[contains(@class,'Order_Form')]//input)[3]");
    //Список станций метро
    private final By selectMetroInput = By.xpath("(//div[contains(@class,'Order_Form')]//input)[4]");
    //выбор станции метро
    private final By selectMetroStation = By.xpath("//div[contains(@class,'Order_Form')]//button[contains(@class,'Order_SelectOption')]");
    //поле телефонный номер
    private final By selectNumberPhone = By.xpath("(//div[contains(@class,'Order_Form')]//input)[5]");
    //кнопка Далее
    private final By selectNextButton = By.xpath("//div[contains(@class,'Order_NextButton')]//button");

    public OrderPage_1(WebDriver driver) {
        super(driver);
    }

    public OrderPage_1 setName(String name) {
        getElement(selectName).sendKeys(name);
        return this;
    }

    public OrderPage_1 setLastName(String lastName) {
        getElement(selectLastName).sendKeys(lastName);
        return this;
    }
    public OrderPage_1 setAddress(String Address) {
        getElement(selectAddress).sendKeys(Address);
        return this;
    }

    public OrderPage_1 setMetro(int metro) {
        getElement(selectMetroInput).click();

        getElementByIndex(selectMetroStation, metro).click();
        return this;
    }

    public OrderPage_1 setNumberPhone(String numberPhone) {
        getElement(selectNumberPhone).sendKeys(numberPhone);
        return this;
    }
    public OrderPage_2 clickNextButton(){
        getElement(selectNextButton).click();

        return new OrderPage_2(driver);
    }
}