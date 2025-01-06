import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import stepObject.RegistrationPageSteps;
import utils.ChromeRunner;

import static dataObject.RegistrationPageData.*;

public class RegistrationTest extends ChromeRunner {
    RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps();

    @Test (priority = 1)
    @Description("Registration Page Test")
    public void registrtationPageTest() {
        registrationPageSteps
                .goToRegPage()
                .enterFirstName(firstName)
                .enterBirthdate(birthDate)
                .choseGender(gender)
                .enterMail(email)
                .enterPass(password)
                .repeatPass(password);
        Assert.assertTrue(registrationPageSteps.registrationButton.is(Condition.visible));
        registrationPageSteps
                .registrationBtn();
    }

}
