package Utils;

import PageObject.Page;
import com.codeborne.selenide.Selenide;

public class Util {
    public void openPage(String url){
        Selenide.open(url);
    }
}
