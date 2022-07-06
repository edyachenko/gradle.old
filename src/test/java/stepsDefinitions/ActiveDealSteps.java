package stepsDefinitions;

import implementations.pageObjects.AbstractBasePage;
import implementations.pageObjects.ActivateThisDealPopUp;
import implementations.pageObjects.ActiveDealsPage;
import implementations.pageObjects.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActiveDealSteps extends AbstractBasePage {


    private ActiveDealsPage activeDealsPage;
    private HomePage homePage;
    private ActivateThisDealPopUp activateThisDealPopUp;

    public ActiveDealSteps() {
        activeDealsPage = new ActiveDealsPage();
        homePage = new HomePage();
    }

    @When("User navigates to Active Deals page")
    public void userNavigatesToPage() {
        homePage.navigateToActiveDeals();
    }

    @Then("Create Report Button is disabled")
    public void createReportButtonIsDisabled() {
        activeDealsPage.verifyCreateReportButtonDisabled();
    }

    @When("User is redirected to Active deals page and chart is loaded")
    public void waitUntilChartIsLoaded(){
        activeDealsPage.waitUntilChartIsLoaded();
    }

}
