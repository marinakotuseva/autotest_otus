package jdi.blazedemo.page;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.epam.web.matcher.testng.Assert.assertEquals;

@JPage(url = "/reserve.php")
public class FlightsPage extends WebPage {

    @FindBy(xpath = "//h3")
    public WebElement find_from_to;
    @FindBy(xpath = "//tr[1]/td[2]")
    public WebElement find_number;
    @FindBy(xpath = "//tr[1]/td[3]")
    public WebElement find_airline;
    @FindBy(xpath = "//tr[1]/td[6]")
    public WebElement find_price;
    @FindBy(css = "input[type='submit']")
    public WebElement find_button_2;

    public String find_number_text = find_number.getText();
    public String find_airline_text = find_airline.getText();
    public String find_price_text = find_price.getText();

    public FlightsPage From_to(String from_to) {
        String find_from_to_text = find_from_to.getText();
        assertEquals(from_to, find_from_to_text, "Error!!");
        return this;
    }

    public void submit(){
        find_button_2.click();
    }

}
