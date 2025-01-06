package pageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class Search {
    public SelenideElement
    searchArea= $(byAttribute("placeholder","ჩაწერეთ საძიებო სიტყვა")),
    searchBtn = $(".searchbutton"),
    searchValidate = $(".categorypagetitle");

}
