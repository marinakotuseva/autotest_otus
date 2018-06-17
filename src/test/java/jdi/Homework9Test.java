package jdi;

import jdi.blazedemo.page.SelectPage;
import org.testng.annotations.Test;

import static jdi.blazedemo.JDIExsampleSite.selectPage;

public class Homework9Test extends BaseTest {

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

    @Test
    public void test(){

        selectPage.open();
        selectPage.findselect_1(fromPort)
                .
    }



}
