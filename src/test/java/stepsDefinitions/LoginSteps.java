package stepsDefinitions;

import com.codeborne.selenide.Selenide;
import implementations.pageObjects.LoginPage;
import io.cucumber.java.en.Given;

import java.time.Duration;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;


public class LoginSteps {
    private LoginPage loginPage;

    public LoginSteps() {
        loginPage = new LoginPage();
    }

    // TODO implement log in with reading credentials from file and remove sleep method
    @Given("User logs in to stage env")
    public void userLogsInToStageEnv() {
        loginPage.openYieldmoWebsite("https://stage.yieldmo.net/");
        loginPage.loginToTheWebsite("project-grain@yieldmo.com", "6LL&&kEtCf?3");
        $("title").shouldHave(attribute("text", "Deal Information"));
        Selenide.sleep(3000);
    }
}
