package implementations.pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public abstract class AbstractBasePage {
    protected SelenideElement activateButton = $x("//button[normalize-space()='Activate']");
    protected SelenideElement circleActionButton = $x("//div[@class='css-1b03ga1']/b");
    protected SelenideElement searchField = $x("//input[@placeholder='Search']");

    private final String dataTableElement = "//td[contains(text(),'%s')]";

    protected void waitUntilSavedIconIsDisplayed() {
        circleActionButton.shouldHave(text("Saved"), Duration.ofSeconds(15));
    }

    public void searchDataInSearchField(String data) {
        searchField.setValue(data).pressEnter();
    }

    public String formatElementXpath(String element, String value) {
        return String.format(element, value);
    }

    public void verifySearchResult(String searchResult) {
        $x(formatElementXpath(dataTableElement, searchResult)).shouldBe(Condition.appear);
    }
}
