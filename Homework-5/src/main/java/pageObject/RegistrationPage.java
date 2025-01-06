package pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
            regBtn = $(byTagAndText("a", "რეგისტრაცია")),
            firstNameInput = $(byAttribute("placeholder", "მომხმარებლის სახელი")),
            birthDateInput = $(byAttribute("placeholder", "დაბადების თარიღი დდ/თთ/წწწწ")),
            genderInput = $(byTagName("select")),
            mailInput = $(byAttribute("placeholder", "ელ-ფოსტა")),
            passInput = $(byAttribute("placeholder", "პაროლი")),
            repeatPassInput = $(byAttribute("placeholder", "გაიმეორეთ პაროლი")),
            registrationButton = $(byTagAndText("span", "რეგისტრაცია"));

}
