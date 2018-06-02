package tests;

import blazedemo.LoginPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Homework4Test {

    WebDriver driver;

    @BeforeClass
    public void beforetest(){

        driver = new ChromeDriver();

    }

    @Test
    public void test(){
        driver.get("http://blazedemo.com/login");
        LoginPage loginPage = new LoginPage(driver);

        Actions actions = new Actions(driver);
        Action moveToButton = actions
                .moveToElement(loginPage.find_button)
                .build();

        moveToButton.perform();

        String findColorAfter = loginPage.find_button.getCssValue("background-color");
        Dimension findSizeAfter = loginPage.find_button.getSize();

        loginPage.equalsSize(findSizeAfter);
        loginPage.equalsColor(findColorAfter);

    }

    @AfterClass
    public void aftertest(){

//        driver.quit();

    }
}
