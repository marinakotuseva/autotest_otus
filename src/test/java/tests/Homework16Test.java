package tests;

import com.codeborne.selenide.Condition;
import com.jayway.jsonpath.JsonPath;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Homework16Test {

    private static String API_URL = "https://dictionary.yandex.net/api/v1/dicservice.json/";
    private static String API_KEY = "dict.1.1.20180725T172621Z.918e4c8c029f1077.661a23216306127b70aec3ad9b41c3e7fa710b76";
    private static String lang_lang = "en-ru";
    private static String text = "Shalom";
    private String textUniRest;

//    private static String textUniRest;

    @BeforeTest
    public void getValueFromRest() throws UnirestException {

        String jsonUniRest = Unirest.get(API_URL + "lookup?key=" + API_KEY + "&lang=" + lang_lang + "&text=" + text).asString().getBody();
        System.out.println(jsonUniRest);

        textUniRest = JsonPath.read(jsonUniRest, "$.def.tr.text[0]");
        System.out.println(textUniRest);

    }

    @Test
    public void validationValueFromUI(){

        open("https://translate.yandex.ru/");
        $("div[id='fakeArea']").setValue(text);
        $("pre[id='translation']").should(Condition.text(textUniRest));

    }


}
