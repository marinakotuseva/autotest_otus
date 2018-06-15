package artlebedev;

import static com.codeborne.selenide.Selenide.$x;

public class InventoryPage {

    public InventoryPage goToMatrixIdeasPage(){
        $x("//a[@class=\"item item-matrix\"]").click();
        return this;
    }

}
