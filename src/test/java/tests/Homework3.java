package tests;


import org.testng.annotations.Test;
import utils.WebDriverManager;

public class Homework3 {

//    public void getSite(String text) {
//        WebDriverManager.getInstance().get("http://blazedemo.com/");
//    }

    @Test
    public  void getSite() {
        WebDriverManager.getInstance().get("http://blazedemo.com/");
    }
}
