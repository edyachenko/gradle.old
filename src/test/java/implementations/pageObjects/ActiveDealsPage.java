package implementations.pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ActiveDealsPage extends AbstractBasePage {
    private SelenideElement createReportButton = $("button[data-cmp-id='btn-create-report--active']");
    private SelenideElement bottomPageLoadingIcon = $(byXpath("//span[@aria-label='table-loading']//*[name()='svg']"));


    public void waitUntilChartIsLoaded() {
        bottomPageLoadingIcon.shouldNotBe(Condition.visible);
    }

    public void verifyCreateReportButtonDisabled() {
        createReportButton.should(Condition.disabled);
    }
}
