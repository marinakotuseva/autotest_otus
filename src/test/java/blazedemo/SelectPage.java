package blazedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage {

    private WebDriver driver;

    @FindBy(xpath = "//select[@name='fromPort']")
    private WebElement findselect_1;

    @FindBy(xpath = "//select[@name='toPort']")
    private WebElement findselect_2;

    @FindBy(css = "input[type='submit']")
    private WebElement find_button;

    public SelectPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
//        findselect_1 = new Select(this.findselect_1);
//        findselect_2 = new Select(this.findselect_2);
    }

    public void selectFrom(String optionValue) {
        findselect_1.sendKeys(optionValue);
    }

    public void selectTo(String optionValue) {
        findselect_2.sendKeys(optionValue);
    }

    public void submit(){
        find_button.click();
    }

}
