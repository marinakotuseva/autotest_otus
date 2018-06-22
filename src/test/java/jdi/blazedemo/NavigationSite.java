package jdi.blazedemo;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import ru.yandex.qatools.allure.annotations.Step;

import static jdi.blazedemo.JDIExsampleSite.*;

@JPage
public class NavigationSite extends WebPage {

    private String fromPort = "Paris";
    private String toPort = "Berlin";
    private String from_to = "Flights from " + fromPort + " to " + toPort + ":";
    private String sendName = "Misha";
    private String sendaddress = "Mishland";
    private String sendcity = "Mishkva";
    private String sendstate = "Mishstate";
    private String sendzipCode = "1919";
    private String sendcreditcardnumber = "111122223333444455556666";
    private String sendcreditcadrmonth = "10";
    private String sendcreditcardyear = "2020";
    private String sendnumbeoncard = "Misha Mishkovich";


    @Step
    public void openSelectPage(){
        selectPage.open();
        selectPage.selectFrom(fromPort);
        selectPage.selectTo(toPort);
        selectPage.submit();

    }
    @Step
    public void openFlightspage() {
        flightsPage.From_to(from_to);
        flightsPage.find_number_text();
        flightsPage.find_airline_text();
        flightsPage.find_price_text();
        flightsPage.submit();

    }
    @Step
    public void openPrivatePage(){
//        privatePage.EqualNumber(flightsPage.find_number_text());
//        privatePage.EqualAirline(flightsPage.find_airline_text());
//        privatePage.EqualPrice(flightsPage.find_price_text());
//        privatePage.EqualCost();
        privatePage.inputname(sendName);
        privatePage.inputaddress(sendaddress);
        privatePage.inputcity(sendcity);
        privatePage.inputstate(sendstate);
        privatePage.inputzipCode(sendzipCode);
        privatePage.inputcreditCardNumber(sendcreditcardnumber);
        privatePage.inputcreditCardMonth(sendcreditcadrmonth);
        privatePage.inputcreditCardYear(sendcreditcardyear);
        privatePage.inputnameOnCard(sendnumbeoncard);

        privatePage.submit();

    }
    @Step
    public void openFinishPage(){
        finishPage.Find_id();
        finishPage.Find_status();
        finishPage.Find_amont();
        finishPage.Find_cardnumber(sendcreditcardnumber);

    }
}
