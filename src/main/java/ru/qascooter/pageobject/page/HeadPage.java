package ru.qascooter.pageobject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeadPage extends BasePage {

    // Кнопки с вопросами
    private final By questionButtons = By.className("accordion__button");
    // Ответы
    private final By answerPanels = By.className("accordion__panel");

    private final By orderButtonOne = By.xpath("//div[contains(@class,'Header_Nav')]/Button[contains(@class,'Button_Button')]");

    private final By orderButtonTwo = By.xpath("//div[contains(@class,'Home_FinishButton')]/Button[contains(@class,'Button_Button')]");
    public HeadPage(WebDriver driver) {
        super(driver);
    }

    public OrderPage_1 clickOrderButton(int orderButtonNumber) {
        if (orderButtonNumber == 1) {
            getElement(orderButtonOne).click();
        }else{
            getElement(orderButtonTwo).click();

        }
        return new OrderPage_1(driver);
    }
    public void clickQuestionButton(int index) {
        getElementByIndex(questionButtons, index).click();
    }
    public String getVisibleAnswerText(){
        String result = "";
        List<WebElement> elements = getElements(answerPanels);
        for (WebElement element : elements) {
            if (element.isDisplayed()){
                result = element.getText();
            }
        }
        return result;
    }
}