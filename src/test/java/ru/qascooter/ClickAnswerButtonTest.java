package ru.qascooter;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.qascooter.pageobject.page.HeadPage;

@RunWith(Parameterized.class)
public class ClickAnswerButtonTest extends BaseTest {
    private final int index;
    private final String answer;
    public ClickAnswerButtonTest(int index, String answer){
        this.index = index;
        this.answer = answer;
    }
    @Parameterized.Parameters
    public static Object[][] getCredentials(){
        return new Object[][]{
                {0, "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {1, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."}
        };
    }

    @Test
    public void clickQuestionButton(){
        HeadPage headPage = new HeadPage(super.driver);
        headPage.clickQuestionButton(this.index);

        String answer = headPage.getVisibleAnswerText();

        Assert.assertEquals(answer, this.answer);
    }
}
