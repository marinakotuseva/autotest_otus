package artlebedev;

import static com.codeborne.selenide.Selenide.$x;

public class MatrixPage {

        public MatrixPage generateIdea(){
        $x("//button[@type=\"submit\"]").click();
        return this;
    }

}
