package ru.qascooter;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;


public class BaseTest {
    protected DriverFactory driverFactory = new DriverFactory();
    protected WebDriver driver;
    @Before
    public void setUp() {

        driverFactory.initDriver();
        driver = driverFactory.getDriver();
        driver.get(EnvConfig.BASE_URL);

        setCookie(new Cookie("Cartoshka", "true"));
        setCookie(new Cookie("Cartoshka-legacy", "true"));
    }
    private void setCookie(Cookie cookie){
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
