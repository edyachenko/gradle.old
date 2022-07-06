package implementations.pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class DealInformationPage extends AbstractBasePage {
    private SelenideElement nameField = $(byId("dealInformationFormControl__dealName"));
    private SelenideElement cpmFieldPrice = $(byName("dealInformationFormControl__cpm"));
    private SelenideElement advertiserField = $(byId("dealInformationFormControl__advertiser"));
    private SelenideElement selectDspDropDown = $(byId("mui-component-select-dealInformationFormControl__dsp"));

    private static Faker faker = new Faker();
    public final static String dealName = "Weather Deal " + faker.number().numberBetween(0,9999999);

    public void setNameField() {
        nameField.click();
        nameField.setValue(dealName);
        waitUntilSavedIconIsDisplayed();
    }

    public void setCpmFieldPrice(String price) {
        cpmFieldPrice.setValue(price);
        waitUntilSavedIconIsDisplayed();
    }

    //TODO refactor selection from dropdown
    public void selectAdvertiserFromDropDown(String advertiserName) {
        advertiserField.click();
        $(byText(advertiserName)).click();
        waitUntilSavedIconIsDisplayed();
    }

    //TODO refactor selection from dropdown
    public void selectDSPFromDropDown(String dspName) {
        selectDspDropDown.click();
        $(byText("Adobe")).shouldBe(Condition.visible);
        $(byText("Adobe")).click();
        selectDspDropDown.click();
        $(byText(dspName)).click();
        waitUntilSavedIconIsDisplayed();
    }

    public void clickActivateButton() {
        activateButton.click();
    }

}
