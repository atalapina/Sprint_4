package ru.qascooter.pageobject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.qascooter.EnvConfig;

import java.util.List;

public class HeadPage extends BasePage {

    //Кнопка «Заказать»

    // Кнопки с вопросами
    private final By QuestionButtons = By.className("accordion__button");
    // Ответы
    private final By AnswerPanels = By.className("accordion__panel");

    public HeadPage(WebDriver driver) {
        super(driver);
    }

    public OrderPage_1 clickOrderButton(String selectorOrderButton) {
        getElement(By.xpath(selectorOrderButton)).click();
        return new OrderPage_1(driver);
    }
    public void clickQuestionButton(int index) {
        getElementByIndex(QuestionButtons, index).click();
    }
    public String getVisibleAnswerText(){
        String result = "";
        List<WebElement> elements = getElements(AnswerPanels);
        for (WebElement element : elements) {
            if (element.isDisplayed()){
                result = element.getText();
            }
        }
        return result;
    };
}