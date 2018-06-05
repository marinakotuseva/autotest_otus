package tests;

import automationpractice.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Homework5Test {

//    ChromeOptions chromeOptions = new ChromeOptions();
    OperaOptions operaOptions = new OperaOptions();
    WebDriver driver;

    @BeforeClass
    public void beforetest() {
//        chromeOptions.addArguments("--headless");
//        driver = new ChromeDriver(chromeOptions);
//        driver = new ChromeDriver();

        operaOptions.setBinary("lib/opera/operadriver");
        driver = new OperaDriver(operaOptions);

    }

    @Test
    public void test() {
        driver.get("http://automationpractice.com/index.php");
        HomePage homePage = new HomePage(driver);
        homePage.getMouseMoveToButton();
        homePage.waitMenu(homePage.findTShirts);
        homePage.clickOnTShirts(homePage.findTShirts);
        assertTrue(homePage.checkTShirtsPage.isDisplayed());
    }

    @AfterClass
    public void aftertest() {

//        driver.quit();
    }
}
