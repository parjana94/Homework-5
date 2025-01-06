package stepObject;

import io.qameta.allure.Step;
import pageObject.LoginPage;

import java.sql.Struct;

public class LoginPageSteps extends LoginPage {
    @Step("Go to registration page")
    public LoginPageSteps goToLoginPage(){
        loginBtn.click();
        return this;
    }
    @Step("Enter email")
    public LoginPageSteps enterEmail(String email){
        emailField.setValue(email);
        return this;
    }
    @Step("Enter password")
    public LoginPageSteps enterPassword(String pass){
        passField.setValue(pass);
        return this;
    }
    @Step("Click login button")
    public LoginPageSteps loginBtn(){
        loginButton.click();
        return this;
    }
}
