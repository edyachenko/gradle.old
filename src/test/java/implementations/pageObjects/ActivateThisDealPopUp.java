package implementations.pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ActivateThisDealPopUp extends AbstractBasePage{
    private SelenideElement activateButton = $x("//div[contains(@class,'MuiDialogActions-root MuiDialogActions-spacing css-mv9245')]/button[@type='submit']");
    private SelenideElement seatIdField = $x("//*[@name='seatId']");
    private SelenideElement activateThisDealHeader = $(byText("Activate this deal"));
    private SelenideElement activateDealButtonLoader = $x("//div[@class='MuiDialogActions-root MuiDialogActions-spacing css-mv9245']");


    public void clickActivateThisDealButton(){
        activateButton.click();
        activateDealButtonLoader.shouldNotBe(Condition.visible, Duration.ofSeconds(15));
    }

    public void verifyIfActivateThisDealTabIsOpened(){
        activateThisDealHeader.shouldBe(Condition.visible);
    }

    public void setSeatIdField (String seatId){
        seatIdField.setValue(seatId);
    }
}
