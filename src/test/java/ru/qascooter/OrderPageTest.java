package ru.qascooter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.qascooter.pageobject.page.*;

@RunWith(Parameterized.class)
public class OrderPageTest extends BaseTest {
    private final int orderButtonNumber;
    private final String name;
    private final String lastName;
    private final String address;
    private final int metro;
    private final String numberPhone;
    private final String whenBringScooter;
    private final int rentalPeriod;
    private final boolean canBlack;
    private final boolean canGray;
    private final String comment;
    public OrderPageTest(int orderButtonNumber, String name, String lastName, String address, int metro, String numberPhone,
                         String whenBringScooter, int rentalPeriod, boolean canBlack, boolean canGray,
                         String comment
                         ) {
        this.orderButtonNumber = orderButtonNumber;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.metro = metro;
        this.numberPhone = numberPhone;
        this.whenBringScooter = whenBringScooter;
        this.rentalPeriod = rentalPeriod;
        this.canBlack = canBlack;
        this.canGray = canGray;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getCredentials(){
        return new Object[][]{
                {1, "Иван","Иванов","Москва",50,"+79280445563","26.03.2024",4,true,false,"комментарий"},
                {2, "Петр","Петров","Казань",200,"+79280445500","27.03.2024",6,true,true,"комментарий 2"},
        };
    }
    @Test
    public void createOrder() {
        
        HeadPage objheadPage = new HeadPage(super.driver);

        OrderPage_1 orderPage1 = objheadPage.clickOrderButton(this.orderButtonNumber)
                .setName(this.name)
                .setLastName(this.lastName)
                .setAddress(this.address)
                .setMetro(this.metro)
                .setNumberPhone(this.numberPhone);

        OrderPage_2 orderPage2 = orderPage1.clickNextButton()
                .setWhenBringScooter(this.whenBringScooter)
                .setRentalPeriod(this.rentalPeriod)
                .setBlackColor(this.canBlack)
                .setGrayColor(this.canGray)
                .setCommentCourier(this.comment);

        OrderPage_3 orderPage3 = orderPage2.clickNextButton();

        OrderPage_4 orderPage4 = orderPage3.clickYesButton();

        assert orderPage4.getResultMessage().startsWith("Заказ оформлен");
    }
}

