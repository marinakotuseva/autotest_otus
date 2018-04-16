package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstTest {


    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://yandex.ru");

        WebElement enterToEmail = driver.findElement(By.cssSelector("div[role='form'] > a.button"));

        enterToEmail.click();

        WebElement inputLogin = driver.findElement(By.name("login"));

        inputLogin.sendKeys("inval@ya.ru");

        WebElement inputPass = driver.findElement((By.name("passwd")));

        inputPass.sendKeys( "password_secret");

        WebElement buttonSubmit = driver.findElement(By.cssSelector("button[type='submit']"));

        assertTrue(buttonSubmit.isDisplayed());

        buttonSubmit.click();

        WebElement errormessage = driver.findElement(By.cssSelector("passport-Domik-Form-Error passport-Domik-Form-Error_active"));

        assertTrue(!errormessage.isDisplayed());

        driver.quit();
    }
}
