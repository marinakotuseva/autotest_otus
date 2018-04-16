package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class SecondClass {

    WebDriver driver;

    @Before
    public void beforeTest() {

        driver = new ChromeDriver();

    }

    @Test
    public void test() {

        driver.get("http://blazedemo.com/");

        WebElement findselect_1 = driver.findElement((By.className("form-inline")));

        findselect_1.sendKeys("San Diego");

        WebElement findselect_2 = driver.findElement(By.name("toPort"));

        findselect_2.sendKeys("Berlin");

        WebElement findbutton = driver.findElement(By.cssSelector("input[type='submit']"));

        findbutton.click();

        WebElement findnewopen = driver.findElement(By.className("table"));

        assertTrue(findnewopen.isDisplayed());

//        assertEquals("error message", 1, 1);


    }

    @After
    public void afterTest(){
//        driver.quit();
    }
}
