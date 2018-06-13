package utils;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class WebDriverManager {

    private static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return  driver;
    }

    public static WebDriver getDriver(String browserName) {

        switch (browserName) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Chrome-headless":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "Chrome-remote":
                try {
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setPlatform(Platform.LINUX);
                    capabilities.setBrowserName("chrome");
                    capabilities.setVersion("67");
//                    capabilities.setVersion("67.0.3396.62");
                    RemoteWebDriver driver = new RemoteWebDriver(URI.create("http://127.0.0.1:4444/wd/hub").toURL(),capabilities);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    System.out.print("Ошибка, Силениум хаб не работает локально!");
                }
                break;
            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "lib/firefox/geckodriver");
                driver = new FirefoxDriver();
                break;
            case "Opera":
                OperaOptions operaOptions = new OperaOptions();
                operaOptions.setBinary("lib/opera/operadriver");
                driver = new OperaDriver(operaOptions);
            default:
                driver = new ChromeDriver();
        }

        return driver;
    }
}
