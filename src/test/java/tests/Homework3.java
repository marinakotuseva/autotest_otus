package tests;

import blazedemo.FinishPage;
import blazedemo.FlightsPage;
import blazedemo.PrivatPage;
import blazedemo.SelectPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Homework3 {

    WebDriver driver;

    @BeforeClass
    public void beforetest(){

        driver = new ChromeDriver();

    }

    @Test
    public void test(){

        driver.get("http://blazedemo.com/");

        SelectPage selectPage = new SelectPage(driver);
        selectPage.selectFrom("San Diego");
        selectPage.selectTo("Berlin");
        selectPage.submit();

        FlightsPage fligtPage = new FlightsPage(driver);
        String from_to = "Flights from San Diego to Berlin:";
        fligtPage.From_to(from_to);
//        System.out.print(fligtPage.find_number_new);
        fligtPage.submit();

        PrivatPage privatPage = new PrivatPage(driver);

//        privatPage.EqualNumber(fligtPage.find_number);
//        privatPage.EqualAirline(fligtPage.find_airline);
//        privatPage.EqualPrice(fligtPage.find_price);
        privatPage.EqualCost();
        privatPage.inputname("Misha");
        privatPage.inputaddress("Mishstreat");
        privatPage.inputcity("Mishcity");
        privatPage.inputstate("Mishstate");
        privatPage.inputzipCode("1919");
        privatPage.inputcreditCardMonth("10");
        privatPage.inputcreditCardYear("2018");
        privatPage.inputcreditCardNumber("111122223333444455556666");
        privatPage.inputnameOnCard("Misha Mishkovich");
        privatPage.submit();

        FinishPage finishPage = new FinishPage(driver);
        finishPage.Find_id();
        finishPage.Find_status();
        finishPage.Find_amont();
        finishPage.Find_cardnumber("111122223333444455556666");

    }

    @AfterClass
    public void aftertest(){

        driver.quit();

    }

}
