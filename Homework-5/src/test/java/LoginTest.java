import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import stepObject.LoginPageSteps;
import utils.ChromeRunner;

import static dataObject.RegistrationPageData.*;

public class LoginTest extends ChromeRunner {
    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @Test(priority = 2)
    @Description("Login page test")
    public void loginPageTest() {
        loginPageSteps
                .goToLoginPage()
                .enterEmail(email)
                .enterPassword(password);
        Assert.assertTrue(loginPageSteps.loginButton.is(Condition.visible));
        loginPageSteps
                .loginBtn();
    }
}
