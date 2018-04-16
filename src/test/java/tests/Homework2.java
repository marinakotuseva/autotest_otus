package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Homework2 {

    WebDriver driver;

    @BeforeClass
    public void beforetest(){

        driver = new ChromeDriver();

    }

    @Test
    public void test() {

        driver.get("http://blazedemo.com/");

//        WebElement findselect_1 = driver.findElement(By.xpath("//form[select/@name='fromPort']"));
//        WebElement findselect_1 = driver.findElement(By.xpath("//input[@name='fromPort']"));
//        WebElement findselect_1 = driver.findElement(By.xpath("//select[name()='fromPort'"));
        WebElement findselect_1 = driver.findElement(By.xpath("//select[@name='fromPort'"));
//        WebElement findselect_1 = driver.findElement(By.xpath("select[name='fromPort']"));

        findselect_1.sendKeys("San Diego");

//        WebElement findselect_2 = driver.findElement(By.cssSelector(""))

//        findselect_2.sendKeys("Berlin");

        WebElement findbutton = driver.findElement(By.cssSelector("input[type='submit']"));

        findbutton.click();




//        WebElement findnewopen = driver.findElement(By.className("table"));
//
//        assertTrue(findnewopen.isDisplayed());


    }

    @AfterClass
    public void aftertest(){

        //        driver.quit();

    }
}
