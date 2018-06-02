package blazedemo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class LoginPage {

    private WebDriver driver;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement find_button;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void equalsColor(String optionValue){
        System.out.print(" findColorAfter: " + optionValue);
        assertEquals("rgba(37, 121, 169, 1)", optionValue, "Error!!" );
    }

    public void equalsSize(Dimension optionValue){
        Dimension findSizeBefore = find_button.getSize();
        System.out.print(" findSizeBefore: " + findSizeBefore);
        System.out.print(" findSizeAfter: " + optionValue);
        assertEquals(findSizeBefore, optionValue, "Size not Equals");
    }
}
