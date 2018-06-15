package artlebedev;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class HomePage {

    public static HomePage enterToHomePage() {
        open("https://www.artlebedev.ru/");
        return page(HomePage.class);
    }
    public HomePage goToInventoriyPage(){
        $x("//a[@href=\"/tools/\"]").click();
        return this;
    }
}
