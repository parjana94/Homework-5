package utils;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.*;

public class ChromeRunner {
    @BeforeTest(description = "Browser configuration before tests")
    public void setUp(){
        open("https://www.ambebi.ge/");
    }
    @AfterTest(description = "Clear browser cookies, localtorage and close browser")
    public void tearDown(){
        clearBrowserCookies();
        clearBrowserLocalStorage();
        sleep(5000);
        closeWindow();
        closeWebDriver();

    }
}
