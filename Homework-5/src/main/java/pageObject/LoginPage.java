package pageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
    loginBtn = $(byTagAndText("a","შესვლა")),
    emailField = $(byAttribute("placeholder","ელ-ფოსტა")),
    passField = $(byAttribute("placeholder", "პაროლი")),
    loginButton =$(byTagAndText("span","ავტორიზაცია"));

}
