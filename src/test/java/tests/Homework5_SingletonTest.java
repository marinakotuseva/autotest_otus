package tests;

import automationpractice.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.WebDriverManager;

public class Homework5_SingletonTest {

//    WebDriver driver;

//    @BeforeClass
//    public void beforetest() {
//
//        WebDriverManager.getDriver("Chrome");
//
//    }

    @Test
    public void test() {

        WebDriverManager.getDriver("Crome").get("http://automationpractice.com/index.php");
        HomePage homePage = new HomePage(WebDriverManager.getDriver("Chrome"));
        homePage.getMouseMoveToButton();
        homePage.waitMenu(homePage.findTShirts);
        homePage.clickOnTShirts(homePage.findTShirts);
        homePage.checkTShirtsPage(homePage.findTShirtsPage);

    }

    @AfterClass
    public void aftertest() {

        WebDriverManager.getDriver("Crome").quit();
//        driver.quit();

    }
}
