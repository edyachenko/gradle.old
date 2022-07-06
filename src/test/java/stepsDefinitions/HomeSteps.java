package stepsDefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HomeSteps {



    @Then("User on the Home page")
    public void userOnTheHomePage() {
        Configuration.timeout = 10000;
        $("title").shouldHave(attribute("text", "Deal Information"));
        $(by("type", "submit")).should(appear);
        $(by("type", "submit")).click();

        sleep(2000);
    }
}
