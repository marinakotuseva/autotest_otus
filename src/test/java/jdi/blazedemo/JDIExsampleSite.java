package jdi.blazedemo;


import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import jdi.blazedemo.page.FinishPage;
import jdi.blazedemo.page.FlightsPage;
import jdi.blazedemo.page.PrivatePage;
import jdi.blazedemo.page.SelectPage;

@JSite(value = "http://blazedemo.com/")
public class JDIExsampleSite extends WebSite {

    public static SelectPage selectPage;
//
//    @Step
//    public void selectFrom(String fromPort) {
//        selectPage.findselect_1.sendKeys(fromPort);
//    }
//
//    @Step
//    public void selectTo(String toPort) {
//        selectPage.findselect_2.sendKeys(toPort);
//    }
//
//    @Step
//    public void submit(){
//        selectPage.find_button.click();
//    }
//
    public static FlightsPage flightsPage;
//
//    @Step
//    public void From_to(String from_to) {
//        String find_from_to_text = flightsPage.find_from_to.getText();
//        assertEquals(from_to, find_from_to_text, "Error!!");
//    }
//
//    @Step
//    public void submit2(){
//        flightsPage.find_button_2.click();
//    }
//
//    String find_number_text = flightsPage.find_number.getText();
//    String find_airline_text = flightsPage.find_airline.getText();
//    String find_price_text = flightsPage.find_price.getText();
//
    public static PrivatePage privatePage;
//
//    @Step
//    public void EqualNumber(String find_number_text){
//        String find_number_2_text = privatePage.find_number_2.getText();
//        String find_number_2_text_split = find_number_2_text.split(": ")[1];
//        assertEquals(find_number_text, find_number_2_text_split, "Error!!" );
//    }
//    @Step
//    public void EqualAirline(String find_airline_text){
//        String find_airline_2_text = privatePage.find_airline_2.getText();
//        String find_airline_2_text_split = find_airline_2_text.split(": ")[1];
//        assertEquals(find_airline_text, find_airline_2_text_split, "Error!!" );
//    }
//    @Step
//    public void EqualPrice(String find_price_text){
//        String find_price_2_text = privatePage.find_price_2.getText();
//        String find_price_2_text_split = find_price_2_text.split(": ")[1];
//        assertEquals(find_price_text, "$" + find_price_2_text_split, "Error!!" );
//    }
//    @Step
//    public void EqualCost(){
//        String find_price_2_text = privatePage.find_price_2.getText();
//        String find_price_2_text_split = find_price_2_text.split(": ")[1];
//        Float find_cost_1_float = Float.parseFloat(find_price_2_text_split);
//        String find_cost_2_text = privatePage.find_cost_2.getText();
//        String find_cost_2_text_split = find_cost_2_text.split(": ")[1];
//        Float find_cost_2_float = Float.parseFloat(find_cost_2_text_split);
//        Float totalcost_summ_float= find_cost_1_float + find_cost_2_float;
//        String find_totalcost_text = privatePage.find_totalcost.getText();
//        Float find_totalcost_float = Float.parseFloat(find_totalcost_text);
//        assertEquals(totalcost_summ_float, find_totalcost_float, "Error!!");
//    }
//    @Step
//    public void inputname(String sendName) {
//        privatePage.find_inputname.sendKeys(sendName);
//    }
//    @Step
//    public void inputaddress(String sendaddress) {
//        privatePage.find_inputaddress.sendKeys(sendaddress);
//    }
//    @Step
//    public void inputcity(String sendcity) {
//        privatePage.find_inputcity.sendKeys(sendcity);
//    }
//    @Step
//    public void inputstate(String sendstate)  {
//       privatePage.find_inputstate.sendKeys(sendstate);
//    }
//    @Step
//    public void inputzipCode(String sendzipCode) {
//        privatePage.find_inputzipCode.sendKeys(sendzipCode);
//    }
//    @Step
//    public void inputcreditCardNumber(String sendcreditcardnumber) {
//        privatePage.find_inputcreditCardNumber.sendKeys(sendcreditcardnumber);
//    }
//    @Step
//    public void inputcreditCardMonth(String sendcreditcadrmonth) {
//        privatePage.find_inputcreditCardMonth.sendKeys(sendcreditcadrmonth);
//    }
//    @Step
//    public void inputcreditCardYear(String sendcreditcardyear) {
//        privatePage.find_inputcreditCardYear.sendKeys(sendcreditcardyear);
//    }
//    @Step
//    public void inputnameOnCard(String sendnumbeoncard) {
//        privatePage.find_inputnameOnCard.sendKeys(sendnumbeoncard);
//    }
//    @Step
//    public void submit3() {
//        privatePage.find_button_3.click();
//    }
//
    public static FinishPage finishPage;
//
//    @Step
//    public void Find_id() {
//        assertTrue(finishPage.find_id.isDisplayed());
//    }
//    @Step
//    public void Find_status() {
//        assertTrue(finishPage.find_status.isDisplayed());
//    }
//    @Step
//    public void Find_amont() {
//        String find_amont_text = finishPage.find_amont.getText();
//        assertEquals("USD", find_amont_text, "Error!!");
//    }
//    @Step
//    public void Find_cardnumber(String sendcreditcardnumber) {
//        String find_cardnumber_text = finishPage.find_cardnumber.getText();
//        String sendcreditcardnumber_char = sendcreditcardnumber.substring(sendcreditcardnumber.length() - 4, sendcreditcardnumber.length());
//        String find_cardnumber_char = find_cardnumber_text.substring(find_cardnumber_text.length() - 4, find_cardnumber_text.length());
//        assertEquals(sendcreditcardnumber_char, find_cardnumber_char, "Error");
//    }

}
