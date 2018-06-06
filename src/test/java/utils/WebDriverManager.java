package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {

    private static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return  driver;
    }

    public static WebDriver getDriver(String browserName) {

//        driver = new ChromeDriver();
//        System.out.print(browserName);

        switch (browserName) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Chrome-headless":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "lib/firefox/geckodriver");
                driver = new FirefoxDriver();
                break;
        }

        return driver;
    }
}
