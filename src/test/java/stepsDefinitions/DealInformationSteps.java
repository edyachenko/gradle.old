package stepsDefinitions;

import implementations.pageObjects.ActivateThisDealPopUp;
import implementations.pageObjects.ActivateThisDealWarningPopUp;
import implementations.pageObjects.DealInformationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DealInformationSteps {
    DealInformationPage dealInformationPage;
    ActivateThisDealPopUp activateThisDealPopUp;
    ActivateThisDealWarningPopUp activateThisDealWarningPopUp;

    public DealInformationSteps() {
        dealInformationPage = new DealInformationPage();
        activateThisDealPopUp = new ActivateThisDealPopUp();
        activateThisDealWarningPopUp = new ActivateThisDealWarningPopUp();
    }

    @When("User fills down name into Name field")
    public void setDealName() {
        dealInformationPage.setNameField();
    }

    @When("User sets the value of CPM field to {string}")
    public void setCPMValue(String value) {
        dealInformationPage.setCpmFieldPrice(value);
    }

    @When("User selects advertiser {string} from dropdown menu")
    public void selectAdvertiserFromDropDown(String advertiser) {
        dealInformationPage.selectAdvertiserFromDropDown(advertiser);
    }

    @When("User selects DSP {string} from DSP dropdown menu")
    public void selectDspFromDropDown(String dspName) {
        dealInformationPage.selectDSPFromDropDown(dspName);
    }

    @Then("User see Activate this deal tab")
    public void verifyIfATDTabIsOpened() {
        activateThisDealPopUp.verifyIfActivateThisDealTabIsOpened();
    }


    @Then("User sets seat id {string}")
    public void setSeatId(String seatId) {
        activateThisDealPopUp.setSeatIdField(seatId);
    }

    @Then("User clicks Activate button in Activate this deal tab")
    public void clickActivateButtonInActivateThisDealTab() {
        activateThisDealPopUp.clickActivateThisDealButton();
    }

    @Then("User should see Warning message about missing mandatory field {string} displayed")
    public void verifyIfWarningMessageIsDisplayedWithMandatoryField(String nameOfField){
        activateThisDealWarningPopUp.verifyIfWarningMessageInActiveDealsIsOpened();
        activateThisDealWarningPopUp.verifyIfMissingMandatoryFieldIsPresentInTheWarning(nameOfField);
    }
    @When("User clicks Cancel button in Warning pop-up message")
    public void clickCancelButtonInWarningPopUp(){
        activateThisDealWarningPopUp.clickCancelButton();
    }


}
