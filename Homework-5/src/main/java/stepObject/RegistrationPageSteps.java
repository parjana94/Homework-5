package stepObject;

import io.qameta.allure.Step;
import pageObject.RegistrationPage;

public class RegistrationPageSteps extends RegistrationPage {
    @Step("Go to registration page")
    public RegistrationPageSteps goToRegPage(){
        regBtn.click();
        return this;
    }
    @Step("Fill firstname input")
    public RegistrationPageSteps enterFirstName(String name){
        firstNameInput.setValue(name);
        return this;
    }
    @Step("Fill firstname input")
    public RegistrationPageSteps enterBirthdate(String date){
        birthDateInput.setValue(date);
        return this;
    }
    @Step("Choose gender")
    public RegistrationPageSteps choseGender(String gender){
        genderInput.selectOption(gender);
        return this;
    }
    @Step("Enter email")
    public RegistrationPageSteps enterMail(String mail){
        mailInput.setValue(mail);
        return this;
    }
    @Step("Enter password")
    public RegistrationPageSteps enterPass(String pass){
        passInput.setValue(pass);
        return this;
    }
    @Step("Repeat password")
    public RegistrationPageSteps repeatPass(String pass){
        repeatPassInput.setValue(pass);
        return this;
    }
    @Step("Click registration button")
    public RegistrationPageSteps registrationBtn(){
        registrationButton.click();
        return this;
    }

}
