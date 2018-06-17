package jdi.blazedemo.page;


import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@JPage(url = "")
public class SelectPage extends WebPage {

    @FindBy(xpath = "//select[@name='fromPort']")
    public WebElement findselect_1;

    @FindBy(xpath = "//select[@name='toPort']")
    public WebElement findselect_2;

    @FindBy(css = "input[type='submit']")
    public WebElement find_button;

    public SelectPage selectFrom(String fromPort) {
        findselect_1.sendKeys(fromPort);
        return this;
    }

    public SelectPage selectTo(String toPort) {
        findselect_2.sendKeys(toPort);
        return this;
    }

    public void submit(){
        find_button.click();
    }

}
