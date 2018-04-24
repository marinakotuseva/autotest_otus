package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Homework2 {

    WebDriver driver;

    @BeforeClass
    public void beforetest(){

        driver = new ChromeDriver();

    }

    String fromPort = "San Diego";
    String toPort = "Berlin";
    String from_to = "Flights from " + fromPort + " to " + toPort + ":";
    String sendName = "Misha";
    String sendaddress = "Mishland";
    String sendcity = "Mishkva";
    String sendstate = "Mishstate";

    @Test
    public void test() {

        driver.get("http://blazedemo.com/");

//        Ввод городов

        WebElement findselect_1 = driver.findElement(By.xpath("//select[@name='fromPort']"));
        findselect_1.sendKeys(fromPort);

        WebElement findselect_2 = driver.findElement(By.xpath("//select[@name='toPort']"));
        findselect_2.sendKeys(toPort);

//        Переход на стриницу выбора авиалиний

        WebElement find_button = driver.findElement(By.cssSelector("input[type='submit']"));
        find_button.click();

//        Сравнение надписи с городами прибытия и отправления

        WebElement find_from_to = driver.findElement((By.xpath("//h3")));
        String find_from_to_text = find_from_to.getText();
        assertEquals(from_to, find_from_to_text, "Error!!");

//        Запоминаем элементы: номер рейса, авиакомпания, стоимость

        WebElement find_number = driver.findElement((By.xpath("//tr[1]/td[2]")));
        String find_number_text = find_number.getText();

        WebElement find_airline = driver.findElement((By.xpath("//tr[1]/td[3]")));
        String find_airline_text = find_airline.getText();

        WebElement find_price = driver.findElement((By.xpath("//tr[1]/td[6]")));
        String find_price_text = find_price.getText();
        System.out.print(find_price_text);

//         Кнопка перехода на страницу ввода персональных данных

        WebElement find_button_2 = driver.findElement(By.cssSelector("input[type='submit']"));
        find_button_2.click();

//        Сравнение выбраных авиалиний, цены и номера полета

        WebElement find_number_2 = driver.findElement(By.xpath("//p[2]"));
        String find_number_2_text = find_number_2.getText();
        String find_number_2_text_split = find_number_2_text.split(": ")[1];
//        System.out.print(find_number_2_text_split);
        assertEquals(find_number_text, find_number_2_text_split, "Error!!" );

        WebElement find_airline_2 = driver.findElement(By.xpath("//p[1]"));
        String find_airline_2_text = find_airline_2.getText();
        String find_airline_2_text_split = find_airline_2_text.split(": ")[1];
//        System.out.print(find_airline_2_text_split);
        assertEquals(find_airline_text, find_airline_2_text_split, "Error!!" );

        WebElement find_price_2 = driver.findElement(By.xpath("//p[3]"));
        String find_price_2_text = find_price_2.getText();
        String find_price_2_text_split = find_price_2_text.split(": ")[1];
        System.out.print(find_price_2_text_split);
        assertEquals(find_price_text, "$" + find_price_2_text_split, "Error!!" );

//        Сумма тотальная
//
//        Integer find cost_1 = find_price_2.split("");
//        WebElement find_cost_2 = driver.findElement(By.xpath("//p[4]"));
//        Integer find_cost_2_int = find_cost_2.getText();
//        Integer totalcost = find_cost_1 + find_cost_2_int;
//
//        WebElement find_totalcost = driver.findElement((By.xpath("//em")));

//        Ввод персональных данных



        WebElement find_inputname = driver.findElement(By.cssSelector("input[name='inputName']"));
        find_inputname.sendKeys(sendName);

        WebElement find_inputaddress = driver.findElement(By.cssSelector("input[name='address']"));
        find_inputaddress.sendKeys(sendaddress);

        WebElement find_inputcity = driver.findElement(By.cssSelector("input[name='city']"));
        find_inputcity.sendKeys(sendcity);

        WebElement find_inputstate = driver.findElement(By.cssSelector("input[name='state']"));
        find_inputstate.sendKeys(sendstate);

        WebElement find_inputzipCode = driver.findElement(By.cssSelector("input[name='zipCode']"));
        find_inputzipCode.sendKeys("1917");

//        WebElement find_inputcardType = driver.findElement(By.cssSelector("input[name='cardType']"));
//        find_inputcardType.sendKeys("visa");

        WebElement find_inputcreditCardNumber = driver.findElement(By.cssSelector("input[name='creditCardNumber']"));
        find_inputcreditCardNumber.sendKeys("111111111111111111111");

        WebElement find_inputcreditCardMonth = driver.findElement(By.cssSelector("input[name='creditCardMonth']"));
        find_inputcreditCardMonth.sendKeys("10");

        WebElement find_inputcreditCardYear = driver.findElement(By.cssSelector("input[name='creditCardYear']"));
        find_inputcreditCardYear.sendKeys("2020");

        WebElement find_inputnameOnCard = driver.findElement(By.cssSelector("input[name='nameOnCard']"));
        find_inputnameOnCard.sendKeys("Misha Mishkovich");

//        Кнопка перехода на страцницу успеха

        WebElement find_button_3 = driver.findElement(By.cssSelector("input[type='submit']"));
        find_button_3.click();

        WebElement find_id = driver.findElement(By.xpath("//tr[1]/td[2]"));
        assertTrue(find_id.isDisplayed());

        WebElement find_status = driver.findElement(By.xpath("//tr[2]/td[2]"));
        assertTrue(find_status.isDisplayed());

        WebElement find_amont = driver.findElement(By.xpath("//tr[3]/td[2]"));
        String find_amont_text = find_amont.getText();
        assertEquals("USD", find_amont_text, "Error!!");

        WebElement find_cardnumber = driver.findElement(By.xpath("//tr[4]/td[2]"));
        String find_cardnumber_text = find_cardnumber.getText();
        assertEquals("xxxxxxxxxxxx" + find_inputcreditCardNumber, find_cardnumber_text, "Error");


    }

    @AfterClass
    public void aftertest(){

//                driver.quit();

    }
}
