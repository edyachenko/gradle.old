package stepsDefinitions;

import implementations.pageObjects.ActiveDealsPage;
import implementations.pageObjects.DealInformationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BaseSteps {

    DealInformationPage dealInformationPage;
    ActiveDealsPage activeDealsPage;

    public BaseSteps() {
        dealInformationPage = new DealInformationPage();
        activeDealsPage = new ActiveDealsPage();
    }

    @When("User clicks on the Activate button")
    public void userclickActivateButton() {
        dealInformationPage.clickActivateButton();
    }

    @When("User searchs Activated deal in the bottom table")
    public void searchData() {
        activeDealsPage.searchDataInSearchField(dealInformationPage.dealName);
    }

    @Then("User should see the search result")
    public void verifySearchResult() {
        activeDealsPage.verifySearchResult(dealInformationPage.dealName);
    }

}
