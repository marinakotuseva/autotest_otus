package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Homework16Test {

    private static String API_URL = "https://translate.yandex.net/api/v1.5/tr.json/translate";
    private static String API_KEY = "trnsl.1.1.20180722T143359Z.9720535089b55317.dddebaf0083a8a7df6d7636f612b6e72cde21796";
    private static String lang_lang = "en-ru";
    private static String text = "Shalom";
    private String textUniRest;

//    private static String textUniRest;

    @BeforeTest
    public void getValueFromRest() throws UnirestException {

        String jsonUniRest = Unirest.get(API_URL).queryString("key", API_KEY)
                .queryString("lang", lang_lang)
                .queryString("text", text)
                .asString()
                .getBody();

        System.out.println(jsonUniRest);

        textUniRest = JsonPath.read(jsonUniRest, "$.text[0]");
        System.out.println(textUniRest);

    }

    @Test
    public void validationValueFromUI(){

        Configuration.browser = "chrome";
        System.setProperty("selenide.browser", "chrome");
        open("https://translate.yandex.ru/");
        $("div[id='fakeArea']").setValue(text);
        $("pre[id='translation']").should(Condition.text(textUniRest));

    }


}
